package main.java.controller;

import main.java.controller.http.AjaxResponse;
import main.java.model.Role;
import main.java.model.User;
import main.java.model.dto.UserDTO;
import main.java.service.ISecurityService;
import main.java.service.IUserDetailsService;
import main.java.service.IUserService;
import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller("UserManagementController")
@RequestMapping("/UserManagement")
public class UserManagementController {
    @Autowired
    IUserService userService;
    @Autowired
    ISecurityService securityService;
    @Autowired
    IUserDetailsService userDetailsService;

    private final Logger log = Logger.getLogger(getClass());
    private final ModelMapper modelMapper = new ModelMapper();

    @RequestMapping(value = "/Users")
    public String showUserManagement(Model model) {
        model.addAttribute("RolesList", Role.getAll());
        return "userManagement/users";
    }

    @RequestMapping(value = "/getUsersTableData", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody
    public List<UserDTO> getTableData() {
        return UserDTO.transformUsersToListDTO(userService.getAll());
    }

    @RequestMapping(value = "/editUser", method = RequestMethod.POST, headers = "Content-Type=application/json")
    @ResponseBody
    public AjaxResponse editUser(@RequestBody Map<String, String> request) {
        AjaxResponse response = new AjaxResponse<>();
        try {
            validateSecurityPassword(request.get("securityPassword"));

            User editedUser = modelMapper.map(request, User.class);
            boolean editedOneSelf = editedUser.getId() == userService.getCurrentUser().getId();

            userService.editUser(editedUser);
            if (editedOneSelf) {
                securityService.reAuthentication(userDetailsService.createUserDetails(editedUser));
            }
            return response;
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
            return response.setError(true).setMessage(e.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return response.setError(true).setMessage("Error during editing!");
        }
    }

    private void validateSecurityPassword(String securityPassword) {
        if (!userService.validateSecurityPassword(securityPassword)) {
            throw new IllegalArgumentException("Security password is not confirmed!");
        }
    }
}

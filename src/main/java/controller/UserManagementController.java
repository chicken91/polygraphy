package main.java.controller;

import main.java.model.Role;
import main.java.model.User;
import main.java.model.dto.UserDTO;
import main.java.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller("UserManagementController")
@RequestMapping("/UserManagement")
public class UserManagementController {
    @Autowired
    IUserService userService;

    final ModelMapper modelMapper = new ModelMapper();

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
    public void editUser(@RequestBody UserDTO userDTO) {
        userService.editUser(modelMapper.map(userDTO, User.class));
    }
}

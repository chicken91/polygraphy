package main.java.controller;

import main.java.model.User;
import main.java.model.dto.UserDTO;
import main.java.service.IUserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller("UserManagementController")
@RequestMapping("/UserManagement")
public class UserManagementController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/Users")
    public String getOrders() {
        return "userManagement/users";
    }

    @RequestMapping(value = "/getUsersTableData", method = RequestMethod.POST, headers = "Accept=application/json")
    public
    @ResponseBody
    List<UserDTO> getTableData() {
        return transformUsersToDTO(userService.getAll());
    }

    private List<UserDTO> transformUsersToDTO(List<User> users){
        return new ModelMapper().map(users, new TypeToken<List<UserDTO>>() {}.getType());
    }
}

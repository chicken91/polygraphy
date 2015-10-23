package main.java.controller;

import com.google.gson.Gson;
import main.java.model.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller("UserManagementController")
@RequestMapping("/UserManagement")
public class UserManagementController {

    @RequestMapping(value = "/Users")
    public String getOrders() {
        return "userManagement/users";
    }

    @RequestMapping(value = "/getUsersTableData", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody List<UserDTO> getUserTableData() {
        List<UserDTO> userDTO = new ArrayList<>();
        userDTO.add(new UserDTO(1, "username_1", "email_1", "role_1"));
        userDTO.add(new UserDTO(2, "username_2", "email_2", "role_2"));
        return userDTO;
    }
}

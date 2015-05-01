package main.java.controller;

import main.java.entity.User;
import main.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("AuthorizationController")
public class AuthorizationController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/startApplication", method = {RequestMethod.GET, RequestMethod.POST})
    public String Authorization(Model model, @ModelAttribute("user") User user){
        System.out.println(user);
        if(userService.checkUser(user)){
            return "application/start";
        } else{
            return "application/not-authorized";
        }
    }
}

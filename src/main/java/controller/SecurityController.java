package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("SecurityController")
public class SecurityController {
    @RequestMapping("/Login.po")
    public String login() {
        return "security/login";
    }

    @RequestMapping(value = "/Logout")
    public String logout() {
        return "security/login";
    }

    @RequestMapping(value = "/NotAuthorized")
    public String notAuthorized() {
        return "application/not-authorized";
    }

    @RequestMapping(value = "/AccessDenied")
    public String accessDenied() {
        return "application/access-denied";
    }
}

package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("SecurityController")
@RequestMapping("/Security")
public class SecurityController {
    @RequestMapping("/Login.po")
    public String doLogin() {
        return "security/login";
    }

    @RequestMapping(value = "/Logout")
    public String doLogout() {
        return "security/login";
    }

    @RequestMapping(value = "/NotAuthorized")
    public String notAuthorized() {
        return "security/not-authorized";
    }

    @RequestMapping(value = "/AccessDenied")
    public String accessDenied() {
        return "security/access-denied";
    } // TODO create jsp
}

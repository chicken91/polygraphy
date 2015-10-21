package main.java.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("SecurityController")
@RequestMapping("/Security")
public class SecurityController {
    @Autowired
    ApplicationController applicationController;

    private final Logger log = Logger.getLogger(getClass());

    @RequestMapping("/Login.po")
    public String doLogin(Authentication authentication) {
        if (authentication != null) {
            return applicationController.getApplicationForm();
        }
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

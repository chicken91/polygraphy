package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ApplicationController")
@RequestMapping("/Application")
public class ApplicationController {
    @RequestMapping(value = "/Form")
    public String getApplicationForm() {
        return "application/main-form";
    }
}

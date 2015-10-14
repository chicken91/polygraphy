package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ApplicationController")
public class ApplicationController {
    @RequestMapping(value = "/StartApplication")
    public String Authorization(){
        return "application/start";
    }
}

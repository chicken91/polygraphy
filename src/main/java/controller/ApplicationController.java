package main.java.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ApplicationController")
@RequestMapping("/Application")
public class ApplicationController {
    private final Logger log = Logger.getLogger(getClass());

    @RequestMapping(value = "/Form")
    public String getApplicationForm() {
        return "application/main-form";
    }

    @RequestMapping(value = "/Orders")
    public String getOrders() {
        return "application/orders";
    }

    @RequestMapping(value = "/CompletedOrders")
    public String getCompletedOrders() {
        return "application/completed-orders";
    }
}

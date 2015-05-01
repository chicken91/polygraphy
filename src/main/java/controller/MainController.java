package main.java.controller;

import main.java.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class MainController {

    @RequestMapping("/index.po")
    public String main(HttpSession session, Model model) throws IllegalArgumentException {
        model.addAttribute("user", new User());
        return "index";
    }

    /*@RequestMapping({"/inDevelopment", "/vestibulum", "/etiam", "/phasellus", "/news", "/rating"})
    public String willBeCreated(HttpSession session, Model model) throws IllegalArgumentException {
        return "access/inDevelopment";
    }

    @RequestMapping(value = "/getServerTime", method = RequestMethod.GET)
    @ResponseBody
    public String getServerTime() throws IllegalArgumentException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String accessDenied() throws IllegalArgumentException {
        return "access/accessDenied403";
    }

    @RequestMapping(value = "/pageNotFound", method = RequestMethod.GET)
    public String pageNotFound() throws IllegalArgumentException {
        return "access/pageNotFound404";
    }*/
}

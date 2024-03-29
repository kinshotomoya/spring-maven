package com.example.demo.controller;

import bean.UserSessionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
public class HomeController {

    @Autowired
    HttpSession httpSession;

    @GetMapping("/")
    public String index() {
        UserSessionBean userInfo = (UserSessionBean) httpSession.getAttribute("userInfo");
        if(userInfo == null) {
            return "redirect:/login";
        }
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}

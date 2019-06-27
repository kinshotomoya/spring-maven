package com.example.controller;

import bean.UserInfoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    HttpSession session;

    @Autowired
    UserInfoBean userInfo;

    @GetMapping("/sign_up")
    public String renderLogin() {
        // sessionの作成
        // email, passwordのバリデーション
        // email, passwordの保存
        createSession();
        return "login";
    }

    private void createSession() {
        // beanに詰める
        session.setAttribute("userInfo", userInfo);
    }
}

package com.example.controller;

import bean.UserInfoBean;
import com.example.form.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    HttpSession httpSession;

    @Autowired
    HttpSession session;

    @Autowired
    UserInfoBean userInfo;

    @GetMapping("/sign_up")
    public String renderSignUp() {
        return "sign_up";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("/sign_up")
    public String create(@ModelAttribute UserForm userForm) {
        // sessionの作成
        // email, passwordのバリデーション
        // email, passwordの保存
        createSession(userForm);
        return "sign_up";
    }

    private void createSession(UserForm userForm) {
        // beanに詰める
        UserInfoBean userInfoBean = new UserInfoBean(userForm.getUserName(), userForm.getTime());
        session.setAttribute("userInfo", userInfoBean);
    }
}

package com.example.demo.controller;

import bean.UserInfoBean;
import com.example.demo.form.UserForm;
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
        // TODO tomoya.kinsho ユーザー情報を作成する処理を書く (2019-06-28)
        System.out.println(userForm);
        createSession(userForm);
        return "redirect:/";
    }

    private void createSession(UserForm userForm) {
        // TODO:　30分をexpiredtimeにする
        UserInfoBean userInfoBean = new UserInfoBean(userForm.getUserName(), userForm.getExpiredTime());
        session.setAttribute("userInfo", userInfoBean);
    }
}

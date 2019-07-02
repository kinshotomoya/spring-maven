package com.example.demo.controller;

import com.example.demo.entity.UserAuth;
import bean.UserSessionBean;
import com.example.demo.form.userAuthForm;
import com.example.demo.repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class UserController {

    @Autowired
    HttpSession httpSession;

    @Autowired
    HttpSession session;

    @Autowired
    private UserAuthRepository userAuthRepository;

    @GetMapping("/sign_up")
    public String renderSignUp() {
        return "sign_up";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("/sign_up")
    public String create(@ModelAttribute userAuthForm userAuthForm) {
        // TODO tomoya.kinsho ユーザー情報を作成する処理を書く (2019-06-28)
        UserAuth userAuth = new UserAuth();
        userAuth.setEmail(userAuthForm.getEmail());
        userAuth.setHashpassword(userAuthForm.getPassword());
        userAuthRepository.save(userAuth);

        createSession(userAuthForm.getUserName());
        return "redirect:/";
    }

    private void createSession(String userName) {
        // TODO:　30分をexpiredtimeにする
        UserSessionBean userSessionBean = new UserSessionBean(userName, LocalDateTime.now());
        session.setAttribute("userInfo", userSessionBean);
    }
}

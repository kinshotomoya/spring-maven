package com.example.demo.controller;

import com.example.demo.entity.AuthUser;
import bean.UserSessionBean;
import com.example.demo.entity.User;
import com.example.demo.form.UserAuthForm;
import com.example.demo.repository.AuthUserRepository;
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
    private AuthUserRepository authUserRepository;

    @GetMapping("/sign_up")
    public String renderSignUp() {
        return "sign_up";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("/sign_up")
    public String create(@ModelAttribute UserAuthForm userAuthForm) {
        // TODO tomoya.kinsho requestを取得する処理書く (2019-07-03)
        AuthUser authUser = new AuthUser();
        authUser.setEmail(userAuthForm.getEmail());
        authUser.setHashed_password(userAuthForm.getPassword());
        AuthUser createdAuthUser = authUserRepository.save(authUser);
        createdUser(createdAuthUser);
        createSession(userAuthForm.getUserName());
        return "redirect:/";
    }

    private void createdUser(AuthUser createdAuthUser) {
        // TODO tomoya.kinsho user tableにnicknameを保存する (2019-07-03)
        User user = new User();
    }

    private void createSession(String userName) {
        // TODO:　30分をexpiredtimeにする
        UserSessionBean userSessionBean = new UserSessionBean(userName, LocalDateTime.now());
        session.setAttribute("userInfo", userSessionBean);
    }
}

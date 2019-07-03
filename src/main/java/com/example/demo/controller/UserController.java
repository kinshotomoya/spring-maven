package com.example.demo.controller;

import com.example.demo.entity.AuthUser;
import bean.UserSessionBean;
import com.example.demo.entity.User;
import com.example.demo.form.UserAuthForm;
import com.example.demo.repository.AuthUserRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private UserRepository userRepository;

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
        AuthUser createdAuthUser = createAuthUser(userAuthForm);
        createUser(createdAuthUser, userAuthForm);
        createSession(userAuthForm.getNickName());
        return "redirect:/";
    }

    private AuthUser createAuthUser(@ModelAttribute UserAuthForm userAuthForm) {
        AuthUser authUser = new AuthUser();
        authUser.setEmail(userAuthForm.getEmail());
        authUser.setHashed_password(userAuthForm.getPassword());
        return authUserRepository.save(authUser);
    }

    private void createUser(AuthUser createdAuthUser, UserAuthForm userAuthForm) {
        User user = new User();
        System.out.println("---------------------------");
        System.out.println(userAuthForm.getNickName());
        user.setNickname(userAuthForm.getNickName());
        user.setAuth_user_id(createdAuthUser.getId());
        userRepository.save(user);
    }

    private void createSession(String userName) {
        // TODO:　30分をexpiredtimeにする
        UserSessionBean userSessionBean = new UserSessionBean(userName, LocalDateTime.now());
        session.setAttribute("userInfo", userSessionBean);
    }
}

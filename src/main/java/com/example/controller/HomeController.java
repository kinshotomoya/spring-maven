package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        // sessionの確認
        // あれば、index.htmlに返す
        // なければ、sign_up画面に飛ばす
        System.out.println("welcome to index action");
        return "index";
    }
}

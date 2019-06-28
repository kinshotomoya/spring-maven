package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


// セキュリティ関連のバリデーションを行うクラス
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity web) throws Exception {
        // カスタムのloginフォームに飛ばす処理
        // これを書かなかったら、自動的に作られたログインフォームに飛んでしまう
        web.formLogin().loginPage("/login");
    }
}

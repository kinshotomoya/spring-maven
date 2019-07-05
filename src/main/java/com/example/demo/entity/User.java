package com.example.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// userControllerにDI（autwired）するために、@Componentをつける
@Component
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;

    private String nickname;

    private Integer auth_user_id;

    public Integer getUser_id() {
        return user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getAuth_user_id() {
        return auth_user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAuth_user_id(Integer auth_user_id) {
        this.auth_user_id = auth_user_id;
    }
}

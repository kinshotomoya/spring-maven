package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;

    private String nickname;

    public Integer getUser_id() {
        return user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

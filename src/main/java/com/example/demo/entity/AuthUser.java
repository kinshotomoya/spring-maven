package com.example.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer auth_user_id;

    private String email;

    private String hashed_password;

    public Integer getId() {
        return auth_user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getHashed_password() {
        return hashed_password;
    }

    public void setId(Integer id) {
        this.auth_user_id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHashed_password(String hashed_password) {
        this.hashed_password = hashed_password;
    }
}

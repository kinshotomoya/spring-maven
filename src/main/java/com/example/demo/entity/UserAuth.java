package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String email;

    private String hashpassword;

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getHashpassword() {
        return hashpassword;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHashpassword(String hashpassword) {
        this.hashpassword = hashpassword;
    }
}

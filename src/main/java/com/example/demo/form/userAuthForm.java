package com.example.demo.form;

import java.util.function.ToDoubleBiFunction;

public class userAuthForm {
    private String email;
    private String password;
    private String userName;

    public userAuthForm(String email, String password, String userName) {
        this.email = email;
        this.password = password;
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        // TODO: ここでハッシュ化する処理を書く
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

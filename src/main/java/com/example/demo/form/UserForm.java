package com.example.demo.form;

import java.time.LocalDateTime;

public class UserForm {
    private String userName;
    private LocalDateTime expiredTime;

    public UserForm(String userName, LocalDateTime expiredTime) {
        this.userName = userName;
        this.expiredTime = expiredTime;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getExpiredTime() {
        return expiredTime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTime(LocalDateTime time) {
        this.expiredTime = time;
    }
}

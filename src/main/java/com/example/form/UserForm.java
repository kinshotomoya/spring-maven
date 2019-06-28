package com.example.form;

import java.time.LocalDateTime;

public class UserForm {
    private String userName;
    private LocalDateTime time;

    public UserForm(String userName, LocalDateTime time) {
        this.userName = userName;
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}

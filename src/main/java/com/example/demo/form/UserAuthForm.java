package com.example.demo.form;

public class UserAuthForm {
    private String email;
    private String password;
    private String userName;

    public UserAuthForm(String email, String password, String userName) {
        System.out.println(email);
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
        // TODO: ここでハッシュ化する処理を書く saltはライブラリで保管してくれる
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

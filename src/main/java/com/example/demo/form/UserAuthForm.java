package com.example.demo.form;

public class UserAuthForm {
    private String email;
    private String password;
    private String nickName;

    public UserAuthForm(String email, String password, String nickName) {
        System.out.println(email);
        System.out.println(password);
        System.out.println(nickName);
        this.email = email;
        this.password = password;
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        // TODO: ここでハッシュ化する処理を書く saltはライブラリで保管してくれる
        this.password = password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

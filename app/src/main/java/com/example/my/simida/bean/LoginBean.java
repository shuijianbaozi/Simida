package com.example.my.simida.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by apple on 16/11/20.
 */

public class LoginBean extends BmobObject {
    private String username;
    private String userpsw;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpsw() {
        return userpsw;
    }

    public void setUserpsw(String userpsw) {
        this.userpsw = userpsw;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "username='" + username + '\'' +
                ", userpsw='" + userpsw + '\'' +
                '}';
    }
}

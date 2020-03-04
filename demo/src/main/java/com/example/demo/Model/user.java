package com.example.demo.Model;

import java.io.Serializable;

public class user implements Serializable {
    private Long userid;

    private String username;

    private String password;

    private String createtime;

    private String status;

    private static final long serialVersionUID = 1L;

    public user(Long userid, String username, String password, String createtime, String status) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.status = status;
    }

    public user() {
        super();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
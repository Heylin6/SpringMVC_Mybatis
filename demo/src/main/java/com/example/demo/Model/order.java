package com.example.demo.Model;

import java.io.Serializable;

public class order implements Serializable {
    private Long orderid;

    private String createuser;

    private String createtime;

    private String status;

    private String memo;

    private static final long serialVersionUID = 1L;

    public order(Long orderid, String createuser, String createtime, String status) {
        this.orderid = orderid;
        this.createuser = createuser;
        this.createtime = createtime;
        this.status = status;
    }

    public order(Long orderid, String createuser, String createtime, String status, String memo) {
        this.orderid = orderid;
        this.createuser = createuser;
        this.createtime = createtime;
        this.status = status;
        this.memo = memo;
    }

    public order() {
        super();
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}
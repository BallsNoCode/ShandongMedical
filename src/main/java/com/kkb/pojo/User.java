package com.kkb.pojo;

public class User {
    private Integer u_loginName;

    private String u_passWord;

    private String u_trueName;

    private String u_email;

    private Integer u_state;

    private Integer r_id;

    public Integer getU_loginName() {
        return u_loginName;
    }

    public void setU_loginName(Integer u_loginName) {
        this.u_loginName = u_loginName;
    }

    public String getU_passWord() {
        return u_passWord;
    }

    public void setU_passWord(String u_passWord) {
        this.u_passWord = u_passWord == null ? null : u_passWord.trim();
    }

    public String getU_trueName() {
        return u_trueName;
    }

    public void setU_trueName(String u_trueName) {
        this.u_trueName = u_trueName == null ? null : u_trueName.trim();
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email == null ? null : u_email.trim();
    }

    public Integer getU_state() {
        return u_state;
    }

    public void setU_state(Integer u_state) {
        this.u_state = u_state;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }
}
package com.yinghai.datingticket.common.model;

import java.util.Date;

public class User {
    private Integer userId;

    private String uNick;

    private String uHeadImg;

    private String uAreaCode;

    private String uTel;

    private String uPassword;

    private Integer uStatus;

    private Date uBirthday;

    private Boolean uSex;

    private Date uCreateTime;

    private Date uUpdateTime;

    private String uDeviceId;

    private Integer uDeviceType;

    private Boolean uDeleted;

    private String uIm;

    private String uToken;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getuNick() {
        return uNick;
    }

    public void setuNick(String uNick) {
        this.uNick = uNick == null ? null : uNick.trim();
    }

    public String getuHeadImg() {
        return uHeadImg;
    }

    public void setuHeadImg(String uHeadImg) {
        this.uHeadImg = uHeadImg == null ? null : uHeadImg.trim();
    }

    public String getuAreaCode() {
        return uAreaCode;
    }

    public void setuAreaCode(String uAreaCode) {
        this.uAreaCode = uAreaCode == null ? null : uAreaCode.trim();
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public Boolean getuSex() {
        return uSex;
    }

    public void setuSex(Boolean uSex) {
        this.uSex = uSex;
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }

    public String getuDeviceId() {
        return uDeviceId;
    }

    public void setuDeviceId(String uDeviceId) {
        this.uDeviceId = uDeviceId == null ? null : uDeviceId.trim();
    }

    public Integer getuDeviceType() {
        return uDeviceType;
    }

    public void setuDeviceType(Integer uDeviceType) {
        this.uDeviceType = uDeviceType;
    }

    public Boolean getuDeleted() {
        return uDeleted;
    }

    public void setuDeleted(Boolean uDeleted) {
        this.uDeleted = uDeleted;
    }

    public String getuIm() {
        return uIm;
    }

    public void setuIm(String uIm) {
        this.uIm = uIm == null ? null : uIm.trim();
    }

    public String getuToken() {
        return uToken;
    }

    public void setuToken(String uToken) {
        this.uToken = uToken == null ? null : uToken.trim();
    }
}
package com.yinghai.datingticket.common.model;

import java.util.Date;

public class ThirdParty {
    private Integer tpId;

    private String openId;

    private Integer type;

    private Integer tpKeyId;

    private Integer sex;

    private String city;

    private String country;

    private String province;

    private String nick;

    private Integer tpType;

    private String imgUrl;

    private Date createTime;

    private Date updateTime;

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTpKeyId() {
        return tpKeyId;
    }

    public void setTpKeyId(Integer tpKeyId) {
        this.tpKeyId = tpKeyId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Integer getTpType() {
        return tpType;
    }

    public void setTpType(Integer tpType) {
        this.tpType = tpType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
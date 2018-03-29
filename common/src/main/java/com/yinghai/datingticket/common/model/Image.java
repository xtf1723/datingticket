package com.yinghai.datingticket.common.model;

import java.util.Date;

public class Image {
    private Integer imgId;

    private Integer iType;

    private Integer iKeyId;

    private String iUrl;

    private Date iCreateTime;

    private Date iUpdateTime;

    private String iAbsolute;

    private Integer itIsUserd;

    private String itAppPath;

    private String itSize;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getiType() {
        return iType;
    }

    public void setiType(Integer iType) {
        this.iType = iType;
    }

    public Integer getiKeyId() {
        return iKeyId;
    }

    public void setiKeyId(Integer iKeyId) {
        this.iKeyId = iKeyId;
    }

    public String getiUrl() {
        return iUrl;
    }

    public void setiUrl(String iUrl) {
        this.iUrl = iUrl == null ? null : iUrl.trim();
    }

    public Date getiCreateTime() {
        return iCreateTime;
    }

    public void setiCreateTime(Date iCreateTime) {
        this.iCreateTime = iCreateTime;
    }

    public Date getiUpdateTime() {
        return iUpdateTime;
    }

    public void setiUpdateTime(Date iUpdateTime) {
        this.iUpdateTime = iUpdateTime;
    }

    public String getiAbsolute() {
        return iAbsolute;
    }

    public void setiAbsolute(String iAbsolute) {
        this.iAbsolute = iAbsolute == null ? null : iAbsolute.trim();
    }

    public Integer getItIsUserd() {
        return itIsUserd;
    }

    public void setItIsUserd(Integer itIsUserd) {
        this.itIsUserd = itIsUserd;
    }

    public String getItAppPath() {
        return itAppPath;
    }

    public void setItAppPath(String itAppPath) {
        this.itAppPath = itAppPath == null ? null : itAppPath.trim();
    }

    public String getItSize() {
        return itSize;
    }

    public void setItSize(String itSize) {
        this.itSize = itSize == null ? null : itSize.trim();
    }
}
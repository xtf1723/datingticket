package com.yinghai.datingticket.common.model;

import java.util.Date;

public class Price {
    private Integer priceId;

    private Integer pTicketId;

    private Integer pTsId;

    private Integer pType;

    private String pTypeName;

    private Integer pPrice;

    private Integer pArea;

    private Integer pUsed;

    private Date pCreateTime;

    private Date pUpdateTime;

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getpTicketId() {
        return pTicketId;
    }

    public void setpTicketId(Integer pTicketId) {
        this.pTicketId = pTicketId;
    }

    public Integer getpTsId() {
        return pTsId;
    }

    public void setpTsId(Integer pTsId) {
        this.pTsId = pTsId;
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public String getpTypeName() {
        return pTypeName;
    }

    public void setpTypeName(String pTypeName) {
        this.pTypeName = pTypeName == null ? null : pTypeName.trim();
    }

    public Integer getpPrice() {
        return pPrice;
    }

    public void setpPrice(Integer pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getpArea() {
        return pArea;
    }

    public void setpArea(Integer pArea) {
        this.pArea = pArea;
    }

    public Integer getpUsed() {
        return pUsed;
    }

    public void setpUsed(Integer pUsed) {
        this.pUsed = pUsed;
    }

    public Date getpCreateTime() {
        return pCreateTime;
    }

    public void setpCreateTime(Date pCreateTime) {
        this.pCreateTime = pCreateTime;
    }

    public Date getpUpdateTime() {
        return pUpdateTime;
    }

    public void setpUpdateTime(Date pUpdateTime) {
        this.pUpdateTime = pUpdateTime;
    }
}
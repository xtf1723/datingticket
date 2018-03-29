package com.yinghai.datingticket.common.model;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer oUserId;

    private Integer oType;

    private String oOrderNo;

    private Integer oPrice;

    private Integer oQty;

    private Integer oTotalMoney;

    private Integer oActualMoney;

    private Integer oStatus;

    private Integer oPayStatus;

    private Integer oPayType;

    private Date oPayTime;

    private Date oCreateTime;

    private Date oUpdateTime;

    private Date oCompleteTime;

    private Date oCancelTime;

    private Integer oCancelType;

    private String oCancelReason;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getoUserId() {
        return oUserId;
    }

    public void setoUserId(Integer oUserId) {
        this.oUserId = oUserId;
    }

    public Integer getoType() {
        return oType;
    }

    public void setoType(Integer oType) {
        this.oType = oType;
    }

    public String getoOrderNo() {
        return oOrderNo;
    }

    public void setoOrderNo(String oOrderNo) {
        this.oOrderNo = oOrderNo == null ? null : oOrderNo.trim();
    }

    public Integer getoPrice() {
        return oPrice;
    }

    public void setoPrice(Integer oPrice) {
        this.oPrice = oPrice;
    }

    public Integer getoQty() {
        return oQty;
    }

    public void setoQty(Integer oQty) {
        this.oQty = oQty;
    }

    public Integer getoTotalMoney() {
        return oTotalMoney;
    }

    public void setoTotalMoney(Integer oTotalMoney) {
        this.oTotalMoney = oTotalMoney;
    }

    public Integer getoActualMoney() {
        return oActualMoney;
    }

    public void setoActualMoney(Integer oActualMoney) {
        this.oActualMoney = oActualMoney;
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public Integer getoPayStatus() {
        return oPayStatus;
    }

    public void setoPayStatus(Integer oPayStatus) {
        this.oPayStatus = oPayStatus;
    }

    public Integer getoPayType() {
        return oPayType;
    }

    public void setoPayType(Integer oPayType) {
        this.oPayType = oPayType;
    }

    public Date getoPayTime() {
        return oPayTime;
    }

    public void setoPayTime(Date oPayTime) {
        this.oPayTime = oPayTime;
    }

    public Date getoCreateTime() {
        return oCreateTime;
    }

    public void setoCreateTime(Date oCreateTime) {
        this.oCreateTime = oCreateTime;
    }

    public Date getoUpdateTime() {
        return oUpdateTime;
    }

    public void setoUpdateTime(Date oUpdateTime) {
        this.oUpdateTime = oUpdateTime;
    }

    public Date getoCompleteTime() {
        return oCompleteTime;
    }

    public void setoCompleteTime(Date oCompleteTime) {
        this.oCompleteTime = oCompleteTime;
    }

    public Date getoCancelTime() {
        return oCancelTime;
    }

    public void setoCancelTime(Date oCancelTime) {
        this.oCancelTime = oCancelTime;
    }

    public Integer getoCancelType() {
        return oCancelType;
    }

    public void setoCancelType(Integer oCancelType) {
        this.oCancelType = oCancelType;
    }

    public String getoCancelReason() {
        return oCancelReason;
    }

    public void setoCancelReason(String oCancelReason) {
        this.oCancelReason = oCancelReason == null ? null : oCancelReason.trim();
    }
}
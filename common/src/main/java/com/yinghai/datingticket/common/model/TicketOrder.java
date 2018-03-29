package com.yinghai.datingticket.common.model;

public class TicketOrder {
    private Integer orderTicketId;

    private Integer otOrderId;

    private Integer otTicketType;

    private Integer otTsId;

    private Integer otPriceId;

    private Integer otUseStatus;

    private String otGetNo;

    private String otPayNo;

    public Integer getOrderTicketId() {
        return orderTicketId;
    }

    public void setOrderTicketId(Integer orderTicketId) {
        this.orderTicketId = orderTicketId;
    }

    public Integer getOtOrderId() {
        return otOrderId;
    }

    public void setOtOrderId(Integer otOrderId) {
        this.otOrderId = otOrderId;
    }

    public Integer getOtTicketType() {
        return otTicketType;
    }

    public void setOtTicketType(Integer otTicketType) {
        this.otTicketType = otTicketType;
    }

    public Integer getOtTsId() {
        return otTsId;
    }

    public void setOtTsId(Integer otTsId) {
        this.otTsId = otTsId;
    }

    public Integer getOtPriceId() {
        return otPriceId;
    }

    public void setOtPriceId(Integer otPriceId) {
        this.otPriceId = otPriceId;
    }

    public Integer getOtUseStatus() {
        return otUseStatus;
    }

    public void setOtUseStatus(Integer otUseStatus) {
        this.otUseStatus = otUseStatus;
    }

    public String getOtGetNo() {
        return otGetNo;
    }

    public void setOtGetNo(String otGetNo) {
        this.otGetNo = otGetNo == null ? null : otGetNo.trim();
    }

    public String getOtPayNo() {
        return otPayNo;
    }

    public void setOtPayNo(String otPayNo) {
        this.otPayNo = otPayNo == null ? null : otPayNo.trim();
    }
}
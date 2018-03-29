package com.yinghai.datingticket.common.model;

import java.util.Date;

public class TicketSchedule {
    private Integer tsId;

    private Integer tsTicketId;

    private Date tsTime;

    private Integer tsHallId;

    private Date tsStartTime;

    private Date tsEndTime;

    private Date tsPresaleStart;

    private Date tsPresaleEnd;

    private Date tsSaleStart;

    private Date tsSaleEnd;

    private Integer tsTicketTotal;

    private Integer tsPresaleTotal;

    private Integer tsTicketStock;

    private Integer tsPresaleStock;

    private Integer tsAvailable;

    private Date tsCreateTime;

    private Date tsUpdateTime;

    public Integer getTsId() {
        return tsId;
    }

    public void setTsId(Integer tsId) {
        this.tsId = tsId;
    }

    public Integer getTsTicketId() {
        return tsTicketId;
    }

    public void setTsTicketId(Integer tsTicketId) {
        this.tsTicketId = tsTicketId;
    }

    public Date getTsTime() {
        return tsTime;
    }

    public void setTsTime(Date tsTime) {
        this.tsTime = tsTime;
    }

    public Integer getTsHallId() {
        return tsHallId;
    }

    public void setTsHallId(Integer tsHallId) {
        this.tsHallId = tsHallId;
    }

    public Date getTsStartTime() {
        return tsStartTime;
    }

    public void setTsStartTime(Date tsStartTime) {
        this.tsStartTime = tsStartTime;
    }

    public Date getTsEndTime() {
        return tsEndTime;
    }

    public void setTsEndTime(Date tsEndTime) {
        this.tsEndTime = tsEndTime;
    }

    public Date getTsPresaleStart() {
        return tsPresaleStart;
    }

    public void setTsPresaleStart(Date tsPresaleStart) {
        this.tsPresaleStart = tsPresaleStart;
    }

    public Date getTsPresaleEnd() {
        return tsPresaleEnd;
    }

    public void setTsPresaleEnd(Date tsPresaleEnd) {
        this.tsPresaleEnd = tsPresaleEnd;
    }

    public Date getTsSaleStart() {
        return tsSaleStart;
    }

    public void setTsSaleStart(Date tsSaleStart) {
        this.tsSaleStart = tsSaleStart;
    }

    public Date getTsSaleEnd() {
        return tsSaleEnd;
    }

    public void setTsSaleEnd(Date tsSaleEnd) {
        this.tsSaleEnd = tsSaleEnd;
    }

    public Integer getTsTicketTotal() {
        return tsTicketTotal;
    }

    public void setTsTicketTotal(Integer tsTicketTotal) {
        this.tsTicketTotal = tsTicketTotal;
    }

    public Integer getTsPresaleTotal() {
        return tsPresaleTotal;
    }

    public void setTsPresaleTotal(Integer tsPresaleTotal) {
        this.tsPresaleTotal = tsPresaleTotal;
    }

    public Integer getTsTicketStock() {
        return tsTicketStock;
    }

    public void setTsTicketStock(Integer tsTicketStock) {
        this.tsTicketStock = tsTicketStock;
    }

    public Integer getTsPresaleStock() {
        return tsPresaleStock;
    }

    public void setTsPresaleStock(Integer tsPresaleStock) {
        this.tsPresaleStock = tsPresaleStock;
    }

    public Integer getTsAvailable() {
        return tsAvailable;
    }

    public void setTsAvailable(Integer tsAvailable) {
        this.tsAvailable = tsAvailable;
    }

    public Date getTsCreateTime() {
        return tsCreateTime;
    }

    public void setTsCreateTime(Date tsCreateTime) {
        this.tsCreateTime = tsCreateTime;
    }

    public Date getTsUpdateTime() {
        return tsUpdateTime;
    }

    public void setTsUpdateTime(Date tsUpdateTime) {
        this.tsUpdateTime = tsUpdateTime;
    }
}
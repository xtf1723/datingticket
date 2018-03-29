package com.yinghai.datingticket.common.model;

import java.util.Date;

public class Ticket {
    private Integer ticketId;

    private String tName;

    private String tImg;

    private Date tStartTime;

    private Date tEndTime;

    private String tPriceRange;

    private String tCity;

    private String tLocale;

    private Double tLocX;

    private Double tLocY;

    private String tBrief;

    private String tNotes;

    private Integer tType;

    private String tContentType;

    private Integer tShelf;

    private String tVideo;

    private Date tCreateTime;

    private Date tUpdateTime;

    private String tDetails;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettImg() {
        return tImg;
    }

    public void settImg(String tImg) {
        this.tImg = tImg == null ? null : tImg.trim();
    }

    public Date gettStartTime() {
        return tStartTime;
    }

    public void settStartTime(Date tStartTime) {
        this.tStartTime = tStartTime;
    }

    public Date gettEndTime() {
        return tEndTime;
    }

    public void settEndTime(Date tEndTime) {
        this.tEndTime = tEndTime;
    }

    public String gettPriceRange() {
        return tPriceRange;
    }

    public void settPriceRange(String tPriceRange) {
        this.tPriceRange = tPriceRange == null ? null : tPriceRange.trim();
    }

    public String gettCity() {
        return tCity;
    }

    public void settCity(String tCity) {
        this.tCity = tCity == null ? null : tCity.trim();
    }

    public String gettLocale() {
        return tLocale;
    }

    public void settLocale(String tLocale) {
        this.tLocale = tLocale == null ? null : tLocale.trim();
    }

    public Double gettLocX() {
        return tLocX;
    }

    public void settLocX(Double tLocX) {
        this.tLocX = tLocX;
    }

    public Double gettLocY() {
        return tLocY;
    }

    public void settLocY(Double tLocY) {
        this.tLocY = tLocY;
    }

    public String gettBrief() {
        return tBrief;
    }

    public void settBrief(String tBrief) {
        this.tBrief = tBrief == null ? null : tBrief.trim();
    }

    public String gettNotes() {
        return tNotes;
    }

    public void settNotes(String tNotes) {
        this.tNotes = tNotes == null ? null : tNotes.trim();
    }

    public Integer gettType() {
        return tType;
    }

    public void settType(Integer tType) {
        this.tType = tType;
    }

    public String gettContentType() {
        return tContentType;
    }

    public void settContentType(String tContentType) {
        this.tContentType = tContentType == null ? null : tContentType.trim();
    }

    public Integer gettShelf() {
        return tShelf;
    }

    public void settShelf(Integer tShelf) {
        this.tShelf = tShelf;
    }

    public String gettVideo() {
        return tVideo;
    }

    public void settVideo(String tVideo) {
        this.tVideo = tVideo == null ? null : tVideo.trim();
    }

    public Date gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(Date tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    public Date gettUpdateTime() {
        return tUpdateTime;
    }

    public void settUpdateTime(Date tUpdateTime) {
        this.tUpdateTime = tUpdateTime;
    }

    public String gettDetails() {
        return tDetails;
    }

    public void settDetails(String tDetails) {
        this.tDetails = tDetails == null ? null : tDetails.trim();
    }
}
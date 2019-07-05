package com.unbabel.challenge.dto;

import javax.persistence.*;

public class TranslatedDTO {

    private Long uid;
    private Integer orderNumber;
    private Float Price;
    private String sourceLanguage;
    private String status;
    private String targetLanguage;
    private String text;
    private String textFormat;

    public TranslatedDTO() {
    }

    public Long getUid() {
        return this.uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Float getPrice() {
        return this.Price;
    }

    public void setPrice(Float Price) {
        this.Price = Price;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextFormat() {
        return this.textFormat;
    }

    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
    }

}

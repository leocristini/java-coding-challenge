package com.unbabel.challenge.model;

import javax.persistence.*;

@Entity
public class Translated {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long uid;
    @Column(length = 100)
    private Integer order_number;
    @Column(length = 100)
    private Float price;
    @Column(length = 100)
    private String source_language;
    @Column(length = 100)
    private String status;
    @Column(length = 100)
    private String target_language;
    @Column(length = 100)
    private String text;
    @Column(length = 100)
    private String text_format;

    
    public Translated() {
    }

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}
	
	public Integer getOrderNumber() {
		return this.order_number;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.order_number = orderNumber;
	}
	
	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float Price) {
		this.price = Price;
	}

	public String getSourceLanguage() {
		return this.source_language;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.source_language = sourceLanguage;
	}
	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	

	public String getTargetLanguage() {
		return this.target_language;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.target_language = targetLanguage;
	}
	
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}	

	public String getTextFormat() {
		return this.text_format;
	}

	public void setTextFormat(String textFormat) {
		this.text_format = textFormat;
	}
    
}
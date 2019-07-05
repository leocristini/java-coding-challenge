package com.unbabel.challenge.dto;

import javax.persistence.*;

public class TranslationDTO {

    private Long id;
    private String text;
    private String sourceLanguage;
    private String targetLanguage;

    public TranslationDTO() {
    }


    public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSourceLanguage() {
		return this.sourceLanguage;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
    }
    
    public String getTargetLanguage() {
		return this.targetLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
    }

}
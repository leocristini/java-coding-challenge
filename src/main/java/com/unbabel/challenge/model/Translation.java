package com.unbabel.challenge.model;

import javax.persistence.*;

@Entity
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100)
    private String text;
    @Column(length = 100)
    private String sourceLanguage;
    @Column(length = 100)
    private String targetLanguage;

    public Translation() {
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

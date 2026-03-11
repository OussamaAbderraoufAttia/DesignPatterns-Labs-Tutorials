package com.esi.designpatterns;

public class Mail {
    private String content;

    public Mail(String content) {
        this.content = content.toLowerCase();
    }

    public String getContent() { return content; }
}

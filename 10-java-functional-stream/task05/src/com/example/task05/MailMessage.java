package com.example.task05;

public class MailMessage implements Post<String> {
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }

    private final String from;
    private final String to;
    private final String content;

    public MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }
}
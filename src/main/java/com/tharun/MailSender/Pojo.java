package com.tharun.MailSender;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Pojo {
    private String to;
    private String subject;
    private String text;

    public Pojo() {
    }

    public String getTo() {
        return to;
    }

    public Pojo setTo(String to) {
        this.to = to;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Pojo setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getText() {
        return text;
    }

    public Pojo setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

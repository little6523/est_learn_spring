package com.ormispring.basic;

public interface EmailSender {

    void sendEmail(String to, String subject, String body);
}

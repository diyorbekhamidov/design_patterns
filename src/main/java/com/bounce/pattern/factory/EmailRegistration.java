package com.bounce.pattern.factory;

import com.bounce.pattern.builder.EmailData;

public class EmailRegistration implements Registration {
    private EmailData emailData;


    public EmailRegistration(EmailData emailData) {
        this.emailData = emailData;
    }

    @Override
    public void register() {
        System.out.println("Registration with a Email \n" + emailData);
    }
}

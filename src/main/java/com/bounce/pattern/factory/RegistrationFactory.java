package com.bounce.pattern.factory;

import com.bounce.pattern.builder.CredentialData;
import com.bounce.pattern.builder.EmailData;
import com.bounce.pattern.builder.PhoneData;

public class RegistrationFactory {


    public static Registration registerUser(int registrationType) {
        Registration registration;

        switch (registrationType) {

            case 1 -> {
                PhoneData phoneData = new PhoneData.PhoneDataBuilder()
                        .setPhoneNumber("+998911119244")
                        .setPassword("Abs12345")
                        .build();

                registration = new PhoneRegistration(phoneData);
            }
            case 2 -> {
                EmailData emailData = new EmailData.EmailDataBuilder()
                        .setEmail("diyordev13@gmail.com")
                        .setPassword("Absdf12345")
                        .build();

                registration = new EmailRegistration(emailData);
            }

            case 3 -> {
                CredentialData credentialData = new CredentialData.CredentialDataBuilder()
                        .setCredential("dss2dASA44sADA455d3sdsda877eqAAa3sd3fe9kiuoWAAp47dod21idS56J4")
                        .build();

                registration = new CredentialRegistration(credentialData);
            }
            default -> {
                registration = null;
            }
        }

        return registration;
    }
}

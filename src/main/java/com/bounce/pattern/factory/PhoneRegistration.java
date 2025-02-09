package com.bounce.pattern.factory;

import com.bounce.pattern.builder.PhoneData;

public class PhoneRegistration implements Registration {

    private PhoneData phoneData;

    public PhoneRegistration(PhoneData phoneData) {
        this.phoneData = phoneData;
    }

    @Override
    public void register() {
        System.out.println("Registration with a Phone number \n" + phoneData);
    }
}

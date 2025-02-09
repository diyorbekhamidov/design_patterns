package com.bounce.pattern.factory;

import com.bounce.pattern.builder.CredentialData;

public class CredentialRegistration implements Registration {

    private CredentialData credentialData;


    public CredentialRegistration(CredentialData credentialData) {
        this.credentialData = credentialData;
    }

    @Override
    public void register() {
        System.out.println("Registration with a Credential \n" + credentialData);
    }
}

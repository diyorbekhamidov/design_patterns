package com.bounce.pattern.builder;

public class CredentialData {
    private String credential;


    private CredentialData(CredentialDataBuilder credentialDataBuilder) {
        this.credential = credentialDataBuilder.credential;
    }

    public static class CredentialDataBuilder {
        private String credential;

        public CredentialDataBuilder setCredential(String credential) {
            this.credential = credential;
            return this;
        }

        public CredentialData build() {
            return new CredentialData(this);
        }
    }

    @Override
    public String toString() {
        return "CredentialData{" +
                "credential='" + credential + '\'' +
                '}';
    }
}

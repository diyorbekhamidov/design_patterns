package com.bounce.pattern.builder;

public class EmailData {
    private String email;
    private String password;

    private EmailData(EmailDataBuilder emailDataBuilder) {
        this.email = emailDataBuilder.email;
        this.password = emailDataBuilder.password;
    }

    public static class EmailDataBuilder {
        private String email;
        private String password;

        public EmailDataBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmailDataBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public EmailData build() {
            return new EmailData(this);
        }

    }

    @Override
    public String toString() {
        return "EmailData{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

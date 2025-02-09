package com.bounce.pattern.builder;

public class PhoneData {

    private String phoneNumber;
    private String password;

    private PhoneData(PhoneDataBuilder phoneDataBuilder) {
        this.phoneNumber = phoneDataBuilder.phoneNumber;
        this.password = phoneDataBuilder.password;
    }


    public static class PhoneDataBuilder {
        private String phoneNumber;
        private String password;

        public PhoneDataBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PhoneDataBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public PhoneData build() {
            return new PhoneData(this);
        }
    }

    @Override
    public String toString() {
        return "PhoneData{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

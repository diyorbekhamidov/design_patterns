package com.bounce.main;


import com.bounce.pattern.factory.Registration;
import com.bounce.pattern.factory.RegistrationFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Select registration:");
        System.out.println("1. Phone");
        System.out.println("2. Email");
        System.out.println("3. Credential");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        Registration registration = RegistrationFactory.registerUser(userInput);
        registration.register();

    }
}
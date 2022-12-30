package com.regex.assignments;

import java.util.Scanner;

public class userReg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        RegExMain validator = new RegExMain();
        System.out.println(validator.validateFirstName(firstName));

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        System.out.println(validator.validateLastName(lastName));

        System.out.println("Enter your email address: ");
        String email = scanner.next();
        System.out.println(validator.validateEmail(email));
      scanner.nextLine();
        System.out.println("Enter your phoneNo address: ");
        String phoneNo= scanner.next();
        System.out.println(validator.validatePhoneNo(phoneNo));
        scanner.nextLine();
        System.out.println("Enter your passward address: ");
        String passward= scanner.next();
        System.out.println(validator.validatePassword(passward));
    }
}

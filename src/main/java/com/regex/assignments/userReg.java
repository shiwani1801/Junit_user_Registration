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

    }
}

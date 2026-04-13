package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter  your name.");

        System.out.println("First name: ");
        String firstName = myScanner.nextLine().trim();

        System.out.println("Middle name: ");
        String middleName = myScanner.nextLine().trim();

        System.out.println("Last name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = myScanner.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName.charAt(0) + ".";
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

//        if (lastName.isEmpty() && suffix.isEmpty()) {
//            fullName = firstName + " " + lastName;
//        } else if (suffix.isEmpty()) {
//            fullName = firstName + " " + middleName + " " + lastName;
//        } else if (middleName.isEmpty()) {
//            fullName = firstName + lastName + ", " + suffix;
//        } else {
//            fullName = "Error";
//        }

        System.out.println("\nFull name: " + fullName);

    }
}

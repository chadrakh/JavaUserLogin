package com.application.userlogin.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialised arrays of accepted usernames and passwords
        String[] usernameArray = {"Admin", "User1", "User2"};
        String[] passwordArray = {"PaSSword", "p455w0rd", "pass_w_ord"};

        //String[][] validLogins = {
        //        {"Admin", "User1", "User2"},
        //        {"PaSSword", "p455w0rd", "pass_w_ord"}
        //};

        boolean usernameNotMatched = true;
        boolean passwordNotMatched = true;

        // Initialised remaining attempts
        int remainingAttempts = 3;

        // The program will loop while username and password are not matched
        while(usernameNotMatched || passwordNotMatched) {

            // User is asked to input username and password, which are then stored as variables
            System.out.println("Enter username: ");
            String inputUsername = scanner.nextLine();
            String inputPassword;

            if (inputUsername.isBlank()) {
                System.out.println("You MUST enter a username.");
            } else {
                System.out.println("Enter password: ");
                inputPassword = scanner.nextLine();

                // If username/password are matched, usernameMatched/passwordMatched will be reassigned to true
                for (String username : usernameArray) {
                    if (inputUsername.equals(username)) {
                        usernameNotMatched = false;

                        for (String password : passwordArray) {
                            if (inputPassword.equals(password)) {
                                passwordNotMatched = false;

                                System.out.println("\nYou have successfully logged in.");
                            }
                        }
                    }
                }

                if (usernameNotMatched || passwordNotMatched) {
                    // Remaining attempts will be decremented for every failed attempts
                    remainingAttempts--;

                    // When remaining attempts reaches 0, the program will lock the user out with a message stating the reason
                    if (remainingAttempts == 0) {
                        System.out.println("*Maximum attempts reached (3).* \nYou have been locked out of the system.");
                        break;

                    } else {
                        System.out.printf("Incorrect username or password. \n%d attempts remaining.\n\n", remainingAttempts);
                    }
                }
            }

        }

        scanner.close();

    }
}
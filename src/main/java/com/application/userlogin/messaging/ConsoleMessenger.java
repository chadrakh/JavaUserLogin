package com.application.userlogin.messaging;

public class InterfaceMessages {

    public void actions() {

    }

    public void loginSuccess() {
        System.out.println("\nYou have successfully logged in.");
    }

    public void loginFail(int remainingAttempts) {
        System.out.printf("\nIncorrect username or password. \n%d attempts remaining.\n\n", remainingAttempts);
    }

    public void maxAttemptsWarning() {
        System.out.println("*Maximum attempts reached (3).* \nYou have been locked out of the system.");
    }
}
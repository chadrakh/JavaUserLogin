package com.authentication.userlogin.app;

import com.authentication.userlogin.user.*;
import com.authentication.userlogin.validation.AuthManager;
import com.authentication.userlogin.validation.InputManager;

public class Main {
    private static final InterfaceMessages INTERFACE_MESSAGES = new InterfaceMessages();
    private static final InputManager inputManager = new InputManager();
    private static final AuthManager authManager = new AuthManager();

    private static int REMAINING_ATTEMPTS = 3;

    private static final String inputUsername = inputManager.getUserInput("Enter username");
    private static final String inputPassword = inputManager.getUserInput("Enter password");

    public static void main(String[] args) {

        while (REMAINING_ATTEMPTS > 0) {
            User inputUser = new User(inputUsername, inputPassword);

            if (authManager.authenticate(inputUser)) {
                INTERFACE_MESSAGES.loginSuccess();
                break;
            } else {
                REMAINING_ATTEMPTS--;
                if (REMAINING_ATTEMPTS == 0) {
                    INTERFACE_MESSAGES.maxAttemptsWarning();
                } else {
                    INTERFACE_MESSAGES.loginFail(REMAINING_ATTEMPTS);
                }
            }
        }

        inputManager.close();
    }
}
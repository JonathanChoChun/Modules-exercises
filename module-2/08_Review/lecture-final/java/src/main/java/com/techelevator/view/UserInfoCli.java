package com.techelevator.view;

import com.techelevator.handler.UserManagment;
import com.techelevator.model.User;

import java.io.PrintStream;
import java.util.Scanner;

public class UserInfoCli {
    private User loggedInUser;
    private Scanner userInput;
    private UserManagment userManager;
    private PrintStream out;

    public UserInfoCli(UserManagment userManager, Scanner userInput, PrintStream out){
        this.userManager = userManager;
        this.userInput = userInput;
        this.out = out;
    }

    public User loginUser() {
        while (true) {
            out.println();
            out.println(AnsiColors.yellowValue("Log into the system",true));
            out.print("Username: ");
            out.flush();
            String username = userInput.nextLine();
            out.print("Password: ");
            out.flush();
            String password = userInput.nextLine();
            if (username.isEmpty() || password.isEmpty()) return null;
            User user = userManager.loginAttempt(username,password);
            if (user!= null) return user;
            out.println();
            out.println(AnsiColors.redValue("*** Username or password incorrect ***",true));
            out.println();
        }

    }
}

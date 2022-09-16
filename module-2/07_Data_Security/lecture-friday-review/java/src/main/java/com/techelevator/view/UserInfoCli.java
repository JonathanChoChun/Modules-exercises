package com.techelevator.view;

import com.techelevator.handler.UserManagment;
import com.techelevator.model.User;

import java.util.Scanner;

public class UserInfoCli {
    private User loggedInUser;
    private Scanner userInput;
    private UserManagment userManager;

    public UserInfoCli(UserManagment userManager, Scanner userInput){
        this.userManager = userManager;
        this.userInput = userInput;
    }

    public User loginUser() {
        System.out.println("Log into the system");
        System.out.print("Username: ");
        System.out.flush();
        String username = userInput.nextLine();
        System.out.print("Password: ");
        System.out.flush();
        String password = userInput.nextLine();

        //check username password combo

        //if valid give welcome message

        //if locked give locked message

        //if invalid and not locked, ask again
        return null;

    }
}

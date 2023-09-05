package com.library.springboot.LibraryApplications.controllers;

import com.library.springboot.LibraryApplications.entity.User;
import com.library.springboot.LibraryApplications.manager.UserDatabaseManager;

import java.util.Scanner;

public class UserRegister {

    public static void  register(){
        UserDatabaseManager userdb = new UserDatabaseManager();
        Scanner scanner = new Scanner(System.in);
        //Register
        System.out.println("Enter your fullname:");
        String fullname = scanner.next();

        System.out.println("Enter your email:");
        String email = scanner.next();

        System.out.println("Enter your password");
        String password = scanner.nextLine();

        User newuser = new User(fullname, email, password);
        userdb.addNewUser(newuser);

        System.out.println("New user registered successfully!");
        LogginMenuForUser.logginMenu();

    }
}

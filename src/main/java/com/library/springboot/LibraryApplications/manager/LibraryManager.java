package com.library.springboot.LibraryApplications.manager;

import com.library.springboot.LibraryApplications.entity.User;

import java.util.Scanner;



public class LibraryManager {

    public static void  login (){
        UserDatabaseManager userdb = new UserDatabaseManager();
        AuthorDatabaseManager authordb = new AuthorDatabaseManager();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option");
        System.out.println("[1] User");
        System.out.println("[2] Author");
        int userOp = scanner.nextInt();
        if (userOp == 1) {
            System.out.println("User/login");
            System.out.println("Enter email:");
            String email = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            System.out.println("Login successful!");

            /*

            if (userdb.authenticateUser(email, password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("login failed.");
            }
            /*
             */
        }else{
            System.out.println("Author/login");
            System.out.println("Enter email:");
            String email = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            //role = author

            if (authordb.authenticateUser(email, password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("login failed.");
            }
        }
    }



}


package com.library.springboot.LibraryApplications.MainLib;

import com.library.springboot.LibraryApplications.ENUM.Category;
import com.library.springboot.LibraryApplications.controllers.UserLogin;
import com.library.springboot.LibraryApplications.controllers.UserRegister;
import com.library.springboot.LibraryApplications.data.LibraryDatabase;
import com.library.springboot.LibraryApplications.entity.Author;
import com.library.springboot.LibraryApplications.entity.User;
import com.library.springboot.LibraryApplications.manager.*;
import com.library.springboot.LibraryApplications.entity.Book;

import java.util.*;


public class LibraryMain {


    private static Scanner scanner = new Scanner(System.in);
    UserLogin userLogin;
    UserRegister userRegister;

    public static void main(String[] args) {


TreeSet<Book>  DSDS= new TreeSet<>();
DSDS.r

        
        
        BookDatabaseManager bookdb = new BookDatabaseManager();
        UserDatabaseManager userdb = new UserDatabaseManager();
        AuthorDatabaseManager authordb = new AuthorDatabaseManager();
        BorrewedBookManager borrewedBM = new BorrewedBookManager();
        LibraryDatabase database = new LibraryDatabase();


        Book book1 = new Book(1, "Martin Eden", "DAFDFAFAFFAFF", Category.LITERATURE, 53.85);
        Book book2 = new Book(2, "German Genius Kolektif", "Kolektif", Category.HISTORY, 228.32);
        Book book3 = new Book(3, "Decameron", "Giovanni Boccaccio", Category.LITERATURE, 275.01);
        Book book4 = new Book(4, "Frankenstein", " Marry Shelley ", Category.NOVEL, 84.00);


        bookdb.addNewBook(book1);
        bookdb.addNewBook(book1);
        bookdb.addNewBook(book2);
        bookdb.addNewBook(book4);
        Book gettitle =  bookdb.getBookByTitle("Frankenstein");
        System.out.println("title***:" + gettitle);

        System.out.println("0000000" + bookdb.getAllBooks());
        System.out.println("**********************");
        System.out.println("Books" + bookdb);
        System.out.println("bookdb.getAllBooks();" + bookdb.getAllBooks());

        System.out.println("*******Title" + bookdb.getBookByTitle("Decameron"));


        User user4 = new User(1, "Gozde Apak", "gozde@hotmail.com", "12345", 1);
        User user2 = new User(2, "Ege Ak", "Ege@hotmail.com", "1474545", 2);
        User user3 = new User(3, "Burcu Ön", "Burcu@hotmail.com", "2455745", 3);


        userdb.addNewUser(user4);
        userdb.addNewUser(user2);
        userdb.addNewUser(user4);
        System.out.println("Userdb:  " + userdb);


        Author author1 = new Author(1, "Marry Shelley", "Frankenstein", 2);
        Author author2 = new Author(1, "Giovanni Boccaccioy", "Decameron", 2);
        Author author3 = new Author(1, "Kolektif", "German Genius Kolektif", 2);

        authordb.addNewAuthor(author1);
        authordb.addNewAuthor(author2);
        authordb.addNewAuthor(author3);
        System.out.println("Authordb:  " + authordb);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("********Welcome to the library app*********");

                System.out.println("Select an option");
                System.out.println("[1] Login");
                System.out.println("[2] Register");
                System.out.println("[3] Exit");

                int roleChoice = scanner.nextInt();
                if (roleChoice == 1) {
                    UserLogin.login();
                } else if (roleChoice == 2) {
                   UserRegister.register();

                } else {
                    System.out.println("Exit");
                    System.exit(0);
                    }
                } catch (Exception ex) {
                System.out.println("Invalid process " + ex.getMessage());
                break;


            }
        }
    }

}








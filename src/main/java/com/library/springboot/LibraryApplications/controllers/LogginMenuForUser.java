package com.library.springboot.LibraryApplications.controllers;

import com.library.springboot.LibraryApplications.ENUM.Category;
import com.library.springboot.LibraryApplications.data.LibraryDatabase;
import com.library.springboot.LibraryApplications.entity.Book;
import com.library.springboot.LibraryApplications.manager.AuthorDatabaseManager;
import com.library.springboot.LibraryApplications.manager.BookDatabaseManager;
import com.library.springboot.LibraryApplications.manager.UserDatabaseManager;

import java.util.List;
import java.util.Scanner;

public class LogginMenuForUser {
   static UserDatabaseManager userdb;

  static   AuthorDatabaseManager authordb ;
    static BookDatabaseManager bookdb ;
   static LibraryDatabase database;


  public static void logginMenu(){

      Scanner scanner = new Scanner(System.in);
      //for users
      System.out.println("Select an option:");
      System.out.println("[1]-Search for books ");
      System.out.println("[2]-Book related transactions");
      System.out.println("[3]-Borrow a book");
      System.out.println("[4]- Return the book");


      int menuOp = scanner.nextInt();
      if (menuOp == 1){
          System.out.println("Select an option:");
          System.out.println("[1]- All books");
          System.out.println("[2]- Search by title");
          System.out.println("[3]- Search by author name");
          System.out.println("[4]- Search by category");
          int roleChoice4 = scanner.nextInt();
          //TODO check
          if (roleChoice4 == 1){
              System.out.println("All Books:"  +bookdb.getAllBooks() );
          } else if (roleChoice4 == 2) {
              System.out.println("Enter the title");
              String title = scanner.nextLine();
              scanner.nextLine();

              Book found =  bookdb.getBookByTitle(title);
              System.out.println("Found Book: " + found);
          }else if (roleChoice4 == 3){
              System.out.println("Enter the author name");
              String authorname = scanner.nextLine();
              List authBook  = bookdb.getBookByAuthorName(authorname);
              System.out.println("Found all books by author name: " + authBook);
          } else if (roleChoice4 == 4) {
              System.out.println("Enter the category");
              String categ = scanner.nextLine();
              List categbook = bookdb.getBooksByCategory(categ);
              System.out.println("Found all books by category : " + categbook);
          }
      } else if (menuOp == 2) {
          System.out.println("Select an option:");
          System.out.println("[1]- Create a new book ");
          System.out.println("[2]- Remove book");
          System.out.println("[2]- Update book");
          //System.out.println("[2]- Search by category");

          int roleChoice5 = scanner.nextInt();

          if (roleChoice5 == 1){
              System.out.println("Enter the id of the book you want to add:");
              int bookid = scanner.nextInt();

              System.out.println("Enter the name of the book.");
              String bookName = scanner.nextLine();

              System.out.println("Enter name of the author:");
              String authorName = scanner.nextLine();

              System.out.println("Enter price of the book");
              int pricebook = scanner.nextInt();

              Book  book = new Book(bookid, bookName, authorName, Category.HISTORY, pricebook);
              bookdb.addNewBook(book);

          } else if (roleChoice5 == 2) {
              System.out.println("Enter the id of the book you want to delete");
              int deletebookid = scanner.nextInt();

              System.out.println("Enter the name of the book.");
              String deletebookName = scanner.nextLine();

              System.out.println("Enter name of the author:");
              String deleteauthorName = scanner.nextLine();

              System.out.println("Enter price of the book");
              int deletepricebook = scanner.nextInt();

              Book deletebook = new Book(deletebookid,deletebookName,deleteauthorName, Category.DOCUMENTARY,deletepricebook);
              bookdb.deleteBook(deletebook);
          }

      }else if (menuOp == 3){
          System.out.println("Enter the your own user id");
          int id = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Enter the id of the book you want to borrow");
          int bookid= scanner.nextInt();
          database.borrowedBooks(id, bookid);

      } else {
          System.out.println("Enter the your own user id");
          int id = scanner.nextInt();
          System.out.println("Enter the id of the book you want to return");
          int bookid= scanner.nextInt();
          database.returnedBooks(id,bookid);
      }

  }

}


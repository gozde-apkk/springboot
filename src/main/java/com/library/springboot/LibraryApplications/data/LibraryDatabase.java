package com.library.springboot.LibraryApplications.data;

import com.library.springboot.LibraryApplications.ENUM.Category;
import com.library.springboot.LibraryApplications.manager.BookDatabaseManager;
import com.library.springboot.LibraryApplications.entity.Author;
import com.library.springboot.LibraryApplications.entity.Book;
import com.library.springboot.LibraryApplications.entity.User;
import com.library.springboot.LibraryApplications.manager.BorrewedBookManager;
import com.library.springboot.LibraryApplications.manager.UserDatabaseManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryDatabase  {


   private Map<Integer, Book> books;
    private  Map<Integer, User> users;

    BorrewedBookManager borrewedBookManager;

    public LibraryDatabase() {
        this.books = new HashMap<>();
        this.users = new HashMap<>();
        this.borrewedBookManager = borrewedBookManager;
    }

    public List getBookByTitle(String title){
        List<Book> foundBook = new ArrayList<>();
        for (Book book : books.values()){
            if (book.getTitle().toLowerCase().trim().equals(title)){
                foundBook.add(book);

            }
        }
        return foundBook;
    }

    public void borrowedBooks (int userid, int bookid){
        User user = users.get(userid);
        Book book = books.get(bookid);

        if (user == null || book == null ){
            System.out.println("Invalid process");
            return;
        }
        if (!book.isBorrowed()){
            if (borrewedBookManager.getBorrowedBooks().size() < borrewedBookManager.getBorrowedBookLimit()){
                book.setBorrowed(true);
                borrewedBookManager.borrowBook(book);
                System.out.println("Book borrowed successfully.");

            } else if (borrewedBookManager.getBorrowedBooks().size() >=5) {
                System.out.println("You can buy a maximum of 5 books.");
            }
        }

    }

    public void returnedBooks(int userid, int bookid){
        User user = users.get(userid);
        Book book = books.get(bookid);

        if (user == null || book == null){
            System.out.println("Invalid process");
        }


        if (borrewedBookManager.getBorrowedBooks().contains(book)){
            borrewedBookManager.returnBook(book);
            book.setBorrowed(false);
            System.out.println("The book was returned to the library");
        }else {
            System.out.println("The book is not borrowed by the user.");
        }
    }

}

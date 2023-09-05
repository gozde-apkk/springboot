package com.library.springboot.LibraryApplications.manager;

import com.library.springboot.LibraryApplications.entity.Book;
import com.library.springboot.LibraryApplications.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BorrewedBookManager {

    private int borrowedBookLimit;
    private List<Book> borrowedBooks;


    public BorrewedBookManager() {
        this.borrowedBookLimit = borrowedBookLimit;
        this.borrowedBooks = borrowedBooks;
    }

    public int getBorrowedBookLimit() {
        return borrowedBookLimit;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < borrowedBookLimit) {
            borrowedBooks.add(book);
        } else {
            System.out.println("You have reached your borrowed book limit.");
        }
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BorrewedBookManager that)) return false;
        return getBorrowedBookLimit() == that.getBorrowedBookLimit() && Objects.equals(getBorrowedBooks(), that.getBorrowedBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBorrowedBookLimit(), getBorrowedBooks());
    }



    @Override
    public String toString() {
        return "BorrewedBookManager{" +
                "borrowedBookLimit=" + borrowedBookLimit +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

    public void borrowBook(int id, int bookid) {
    }
}

package com.library.springboot.LibraryApplications.manager;



import com.library.springboot.LibraryApplications.ENUM.Category;
import com.library.springboot.LibraryApplications.entity.Book;
import com.library.springboot.LibraryApplications.entity.User;

import java.util.*;
import java.util.stream.Collectors;


//kitaplarla ilgili işlemler***********
public class BookDatabaseManager {

    private Map<Integer, Book> allbooks;

    public BookDatabaseManager(){

        allbooks = new HashMap<>();
    }

    public void addNewBook(Book book) {
            if (!allbooks.containsKey(book)){
                allbooks.put((int) book.getBook_id(), book);
                System.out.println("Books:" + book);
                book.add();
        } else {
            System.out.println("This id has been already entried. ");
        }

    }

    public List<Book> getAllBooks(){
        return allbooks.values().stream().toList();
    }

    public void deleteBook(Book book) {
        if (allbooks.containsKey(book)) {
            allbooks.remove(book);
        } else {
            System.out.println("Could not delete book");
        }
    }


    public Book getBookByTitle(String title) {
       for (Book book : allbooks.values()){
           if (book.getTitle().equals(title)){
               return book;
           }
       }
        System.out.println("Not found a book");
       return null;
    }
    public List<Book> getBooksByCategory(String category) {
        return allbooks.values().stream().filter(book -> book.getCategory().equals(category)).collect(Collectors.toList());
    }

    public List getBookByAuthorName(String author){
        List<Book> filterAuthor = new ArrayList<>();
        for (int i = 0; i<allbooks.size(); i++){
            if (allbooks.containsKey(author)){
                filterAuthor.get(i);
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "BookDatabaseManager{" +
                "books=" + allbooks +
                '}';
    }
}
package com.library.springboot.LibraryApplications.entity;



import com.library.springboot.LibraryApplications.ENUM.Category;

import java.util.Objects;

public class Book  implements Collective {


    private int book_id;
    private String title;
    private String author;
    private Category category;
    private double price;

    private boolean isBorrowed;





    public Book(int book_id, String title, String author, Category category, double price) {

        this.book_id = book_id;
        this.title = title;
        this.author= author;
        this.category = category;
        this.price = price;
        this.isBorrowed = true;
    }

    public Book() {
    }
    public Book(String title, String authorName) {
    }


    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


    public long getBook_id() {
        return book_id;
    }


    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return book_id == book_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBook_id());
    }




    //FLEXIBLE

    @Override
    public void add() {
       System.out.println("Book successfully added");
    }

    @Override
    public void delete() {

        System.out.println("Book successfully deleted");
    }

    @Override
    public void update() {
        System.out.println("Book successfuly updated...");
    }


    @Override
    public void getById() {
        System.out.println("Book successfully founded");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("book-id: "+ book_id + "/n");
        builder.append("title:  " + title  + "/n");
        builder.append("author:  " + author + "/n");
        builder.append(" category:  " + category + "/n");
        builder.append(" price:  " + price + "/n");



        String result = builder.toString();
        System.out.println(result);

        return result;
    }
}


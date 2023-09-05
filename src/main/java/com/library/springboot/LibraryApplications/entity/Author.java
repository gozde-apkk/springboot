package com.library.springboot.LibraryApplications.entity;

import java.awt.print.Book;
import java.util.List;
import java.util.Objects;

public class Author implements Collective {

    private long author_id;
    private String fullname;
    private String email;
    private String password;

    private String book_name;
    private int books_count;

    public Author(long author_id, String fullname,String book_name, int books_count) {
        this.author_id = author_id;
        this.fullname = fullname;
        this.book_name = book_name;
        this.books_count = books_count;
    }

    public long getAuthor_id() {

        return author_id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setAuthor_id(long author_id) {

        this.author_id = author_id;
    }

    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBooks_count() {
        return books_count;
    }

    public void setBooks_count(int books_count) {
        this.books_count = books_count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return author_id == author.author_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author_id);
    }

    @Override
    public void add() {
        System.out.println("Author successfully added..");
    }


    @Override
    public void delete() {
        System.out.println("Author successfully deleted");
    }

    @Override
    public void update() {
        System.out.println("Author successfully updated..");
    }

    @Override
    public void getById() {
        System.out.println(author_id + "no"+ getClass().getSimpleName() +"founded.." );
    }


    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
       builder.append("author_id"+ author_id);
       builder.append("Fullname:" + fullname);
       builder.append("Book Name:" + book_name);
       builder.append("Book Count:" + books_count);
        String result = builder.toString();
        System.out.println(result);

        return result;
    }
}

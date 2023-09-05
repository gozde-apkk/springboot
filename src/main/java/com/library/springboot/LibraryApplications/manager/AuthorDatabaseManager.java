package com.library.springboot.LibraryApplications.manager;

import com.library.springboot.LibraryApplications.entity.Author;
import com.library.springboot.LibraryApplications.entity.User;

import java.util.HashMap;
import java.util.Map;

public class AuthorDatabaseManager {

    private Map<Integer, Author> authors ;

    public AuthorDatabaseManager() {
       authors = new HashMap<>();
    }

    public void addNewAuthor(Author author){
        if (!authors.containsKey(author)){
            authors.put((int) author.getAuthor_id(), author);
            author.add();
        }else{
            System.out.println("Author is already exist..");
        }
    }

    public Author getAuthorByEmail(String email) {
        return authors.values().stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public boolean authenticateUser(String email, String password) {
        Author author = getAuthorByEmail(email);
        return author != null && author.getPassword().equals(password);
    }
    @Override
    public String toString() {
        return "AuthorDatabaseManager{" +
                "authors=" + authors +
                '}';
    }
}

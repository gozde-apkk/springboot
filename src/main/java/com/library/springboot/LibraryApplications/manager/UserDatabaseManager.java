package com.library.springboot.LibraryApplications.manager;

import com.library.springboot.LibraryApplications.data.LibraryDatabase;
import com.library.springboot.LibraryApplications.entity.Book;
import com.library.springboot.LibraryApplications.entity.User;

import java.util.*;


public class UserDatabaseManager  {

   private Map<Integer, User> users ;
    private Map<Book, User> borrowedBook;

   BookDatabaseManager bookDatabaseManager;


    public UserDatabaseManager() {
        users = new HashMap<>();
    }


    public Map<Integer, User> userdatabase(){
        return users;
    }


    public void addNewUser(User user){
        if (!users.containsKey(user)){
            users.put((int) user.getUser_id(), user);
            user.add();
        }else{
            System.out.println("User already exist");
        }
    }


    /*
    public boolean authenticateUser(String email, String password) {
        User user =users.get(email).getUserByEmail(email);
        return user != null && user.getPassword().equals(password);
    }

    public User getUserByEmail(String email) {
        return users.values().stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
    */

    public User getUserById(int id) {
        return users.get(id);
    }

    public void updateUser(User user) {
        users.put((int) user.getUser_id(), user);
    }

    public void deleteUser(int id) {
        users.remove(id);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }


    @Override
    public String toString() {
        return "UserDatabaseManager{" +
                "users=" + users +
                '}';
    }
}

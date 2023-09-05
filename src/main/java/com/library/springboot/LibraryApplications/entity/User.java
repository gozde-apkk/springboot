package com.library.springboot.LibraryApplications.entity;

import com.library.springboot.LibraryApplications.data.LibraryDatabase;
import com.library.springboot.LibraryApplications.manager.BookDatabaseManager;
import com.library.springboot.LibraryApplications.manager.UserDatabaseManager;
import org.apache.catalina.realm.UserDatabaseRealm;

import java.awt.print.Book;
import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;




public class User extends UserDatabaseManager implements Collective {

    private int user_id;
    private String fullname;
    private String email;

    private String password;




    public User(int user_id, String fullname, String email, String password, int borrowedBook) {
        this.user_id = user_id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;

    }
    public User(String fullname, String email,String password){
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }


    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void getById() {

    }



    @Override
    public int hashCode() {
        return Objects.hash(getUser_id(), getFullname(), getEmail(), getPassword());
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}

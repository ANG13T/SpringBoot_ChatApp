package com.udacity.jwdnd.todo.Todo.model;

public class User {
    private String userid;
    private String username;
    private String salt;
    private String password;
    private String firstName;
    private String lastName;

    public User(String id, String name, String salt, String pass, String first, String last){
        userid = id;
        username = name;
        this.salt = salt;
        password = pass;
        firstName = first;
        lastName = last;
    }

    public String getUsername(){
        return username;
    }

    public String getSalt(){
        return salt;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }


    public String getPassword(){
        return password;
    }
}

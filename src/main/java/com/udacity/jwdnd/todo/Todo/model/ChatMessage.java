package com.udacity.jwdnd.todo.Todo.model;

public class ChatMessage {
    public String messagetext;
    public String username;
    public int messageid;

    public ChatMessage(String text, String user){
        messagetext = text;
        username = user;
    }
}

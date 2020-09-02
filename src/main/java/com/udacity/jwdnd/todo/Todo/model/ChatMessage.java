package com.udacity.jwdnd.todo.Todo.model;

public class ChatMessage {
    public String messageText;
    public String username;
    public int messageid;

    public ChatMessage(String text, String user){
        messageText = text;
        username = user;
    }
}

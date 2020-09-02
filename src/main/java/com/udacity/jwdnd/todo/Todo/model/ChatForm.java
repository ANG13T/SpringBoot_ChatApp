package com.udacity.jwdnd.todo.Todo.model;

public class ChatForm {
    public String username;
    public String messageText;
    public String messageType;

    public void setMessageText(String messageText){
        this.messageText = messageText;
    }

    public String setUsername(String username){
        this.username = username;
    }

    public String getMessageText(){
        return this.messageText;
    }

    public String getUsername(){
        return this.username;
    }

    public String getMessageType(){
        return this.messageType;
    }
}

package com.udacity.jwdnd.todo.Todo;

public class ChatForm {
    public String username;
    public String messageText;
    public String messageType;

    public void setUsername(String username){
        this.username = username;
    }

    public void setMessageText(String messageText){
        this.messageText = messageText;
    }

    public void setMessageType(String messageType){
        this.messageType = messageType;
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

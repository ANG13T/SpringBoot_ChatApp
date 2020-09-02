package com.udacity.jwdnd.todo.Todo.service;

import com.udacity.jwdnd.todo.Todo.model.ChatForm;
import com.udacity.jwdnd.todo.Todo.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private List<ChatMessage> messages;

    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
    }

    public void addMessage(ChatForm chatForm){

       String message = chatForm.getMessageText();
        System.out.println("form message " + message);
        if(chatForm.getMessageType() != null){
            switch(chatForm.getMessageType()){
                case "Shout":
                    message = message.toUpperCase();
                    break;
                case "Whisper":
                    message = message.toLowerCase();
                    break;
            }
        }



        ChatMessage newMessage = new ChatMessage(message, chatForm.getUsername());
        this.messages.add(newMessage);
        System.out.println("the messages ");
        System.out.println(this.messages);
    }

    public List<ChatMessage> getMessages(){
        return messages;
    }
}

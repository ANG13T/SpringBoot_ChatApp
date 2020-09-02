package com.udacity.jwdnd.todo.Todo.controller;

import com.udacity.jwdnd.todo.Todo.model.ChatForm;
import com.udacity.jwdnd.todo.Todo.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private MessageService messageService;

    public ChatController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping
    public String getHome(ChatForm chatForm, Model model){
        System.out.println("Get req sent");
        model.addAttribute("messages", this.messageService.getMessages());
        return "chat";
    }

    @PostMapping
    public String postHome(Authentication authentication, ChatForm chatForm, Model model){
        System.out.println("POST req sent");
        chatForm.setUsername(authentication.getName());
        messageService.addMessage(chatForm);
        model.addAttribute("messages", messageService.getMessages());
        chatForm.setMessageText("");
        return "chat";
    }
}

package com.udacity.jwdnd.todo.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String postHome(ChatForm chatForm, Model model){
        System.out.println("POST req sent");
        messageService.addMessage(chatForm);
        model.addAttribute("messages", messageService.getMessages());
        chatForm.setMessageText("");
        return "chat";
    }
}

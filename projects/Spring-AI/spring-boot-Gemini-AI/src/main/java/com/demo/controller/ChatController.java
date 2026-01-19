package com.demo.controller;

import com.demo.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class ChatController {

   private final ChatService chatService;

    public ChatController(ChatService chatService) {
         this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt){
        log.info("Received chat request with prompt: {}", prompt);
        return chatService.ask(prompt);
    }


}

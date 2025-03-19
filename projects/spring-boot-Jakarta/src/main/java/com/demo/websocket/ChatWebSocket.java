package com.demo.websocket;

import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

@ServerEndpoint("/chat")
@Component
public class ChatWebSocket {
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("WebSocket connection established!");
    }

    @OnMessage
    public String onMessage(String message) {
        return "Received: " + message;
    }
}


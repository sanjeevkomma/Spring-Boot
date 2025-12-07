package com.demo.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.ChatClient.CallResponseSpec;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChatServiceTest {

    @Test
    void testAskReturnsExpectedContent() {
        ChatClient.Builder builder = Mockito.mock(ChatClient.Builder.class);
        ChatClient chatClient = Mockito.mock(ChatClient.class);

        ChatClient.ChatClientRequestSpec requestSpec = Mockito.mock(ChatClient.ChatClientRequestSpec.class);
        CallResponseSpec responseSpec = Mockito.mock(CallResponseSpec.class);

        Mockito.when(builder.build()).thenReturn(chatClient);
        Mockito.when(chatClient.prompt("Hello")).thenReturn(requestSpec);

        Mockito.when(requestSpec.call()).thenReturn(responseSpec);
        Mockito.when(responseSpec.content()).thenReturn("Hi there!");

        ChatService chatService = new ChatService(builder);

        String result = chatService.ask("Hello");

        assertEquals("Hi there!", result);
    }
}

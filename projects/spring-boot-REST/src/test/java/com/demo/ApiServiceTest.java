package com.demo;

import com.demo.service.ApiService;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ApiServiceTest {

    @Mock
    private RestTemplate restTemplate;
    private ObjectMapper objectMapper = new ObjectMapper();
    private final String mockApiUrl = "https://jsonplaceholder.typicode.com/posts";
    @InjectMocks
    private ApiService apiService;

    @Test
    void testFetchData() throws Exception {
        String jsonResponse = "[{" +
                "    \"userId\": 1," +
                "    \"id\": 1," +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\"," +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"" +
                "  }]";

        when(restTemplate.getForObject(mockApiUrl, String.class)).thenReturn(jsonResponse);

        ApiService apiService = new ApiService(restTemplate, objectMapper, mockApiUrl);
        JsonNode result = apiService.fetchData();

        assertNotNull(result);
        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", result.get(0).get("title").asText());
        // verify(objectMapper).readTree(jsonResponse);
    }
}

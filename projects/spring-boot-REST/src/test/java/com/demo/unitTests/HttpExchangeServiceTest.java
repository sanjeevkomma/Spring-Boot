package com.demo.unitTests;

import com.demo.service.HttpExchangeService;
import com.demo.util.client.HttpExchangeClient;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class HttpExchangeServiceTest {

    @Mock
    private HttpExchangeClient httpExchangeClient;

    @InjectMocks
    private HttpExchangeService httpExchangeService;

    @Test
    void testFetchData_ReturnsExpectedValue() {
        String currency = "USD";
        String expected = "mockedResponse";
        when(httpExchangeClient.fetchData(currency)).thenReturn(expected);

        String result = httpExchangeService.fetchData(currency);

        assertEquals(expected, result);
        verify(httpExchangeClient, times(1)).fetchData(currency);
    }
}

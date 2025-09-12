package com.demo.unitTests;

import com.demo.service.WebClientService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersUriSpec;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import reactor.core.publisher.Mono;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.net.URI;
import org.springframework.web.util.UriBuilder;

@ExtendWith(MockitoExtension.class)
class WebClientServiceTest {

    @Mock
    private WebClient webClient;

    @Mock
    private RequestHeadersUriSpec<?> requestHeadersUriSpec;

    @Mock
    private RequestHeadersSpec<?> requestHeadersSpec;

    @Mock
    private ResponseSpec responseSpec;

    @InjectMocks
    private WebClientService webClientService;

    @Test
    void testFetchData_ReturnsExpectedValue() {
        // given
        String param = "USD";
        String expected = "mockedResponse";

        /* when(webClient.get()).thenReturn(requestHeadersUriSpec);
        when(requestHeadersUriSpec.uri(ArgumentMatchers.<Function>any())).thenReturn(requestHeadersSpec);
        when(requestHeadersSpec.retrieve()).thenReturn(responseSpec);
        when(responseSpec.bodyToMono(String.class)).thenReturn(Mono.just(expected));


        String result = webClientService.fetchData(param);

        assertEquals(expected, result);
        verify(webClient, times(1)).get(); */
    }
}
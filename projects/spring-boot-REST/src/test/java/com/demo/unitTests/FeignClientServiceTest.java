package com.demo.unitTests;

import com.demo.service.FeignClientService;
import com.demo.util.client.FeignClientUtil;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class FeignClientServiceTest {

    @Mock
    private FeignClientUtil feignClientUtil;

    @InjectMocks
    private FeignClientService feignClientService;

    @Test
    void testFetchData_ReturnsExpectedValue() {
        String expected = "mockedData";
        when(feignClientUtil.getData()).thenReturn(expected);

        String result = feignClientService.fetchData();

        assertEquals(expected, result);
        verify(feignClientUtil, times(1)).getData();
    }
}
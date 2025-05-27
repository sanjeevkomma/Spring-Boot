package com.demo;

import com.demo.service.HelloServiceImpl;
import org.apache.thrift.TException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class HelloServiceImplTest {

    @Test
    void testSayHello() throws TException {
        HelloServiceImpl helloService = new HelloServiceImpl();
        String name = "John Doe";
        String response = "Hello, There, John Doe!!!!";
        String result = helloService.sayHello(name);
        Assertions.assertEquals(response,result);
    }
}
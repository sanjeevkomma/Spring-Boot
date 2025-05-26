package com.demo.integration;

import com.demo.HelloService;
import com.demo.HelloServiceImpl;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HelloServiceTest {

    @BeforeAll
    static void startServer() throws Exception {
        HelloService.Processor<HelloServiceImpl> processor = new HelloService.Processor<>(new HelloServiceImpl());
        Runnable serverTask = () -> {
            try {
                TServerTransport serverTransport = new TServerSocket(9090);
                TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
                server.serve();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        new Thread(serverTask).start();
        Thread.sleep(1000); // Wait for server to start
    }

    @Test
    void testSayHelloViaThrift() throws Exception {
        TTransport transport = new TSocket("localhost", 9090);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        HelloService.Client client = new HelloService.Client(protocol);

        String name = "John Doe";
        String response = "Hello, There, John Doe!!!!";

        String result = client.sayHello(name);
        Assertions.assertEquals(response, result);

        transport.close();
    }
}
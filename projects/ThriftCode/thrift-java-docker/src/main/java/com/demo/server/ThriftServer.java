package com.demo.server;

import com.demo.HelloService;
import com.demo.HelloServiceImpl;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class ThriftServer {

    public static void main(String[] args) throws Exception {

        HelloService.Processor processor = new HelloService.Processor(new HelloServiceImpl());
        TServerTransport serverTransport = new TServerSocket(9090);
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
        System.out.println("Starting Thrift server on port 9090...");
        server.serve();

    }
}
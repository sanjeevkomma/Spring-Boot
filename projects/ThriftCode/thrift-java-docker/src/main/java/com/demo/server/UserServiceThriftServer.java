package com.demo.server;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class UserServiceThriftServer {
    public static void main(String[] args) throws Exception {

        TServerTransport serverTransport = new TServerSocket(9090);
        UserService.Processor processor = new UserService.Processor(new UserServiceImpl());

        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
        System.out.println("Starting Thrift server...");
        server.serve();

    }
}

package com.demo.client;

import com.demo.service.UserService;
import com.demo.struct.User;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class UserServiceThriftClient {

    public static void main(String[] args) {

        try {
            TTransport transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            UserService.Client client = new UserService.Client(protocol);

            User user = client.getUser(1243);
            System.out.println("User ID: " + user.id + ", Name: " + user.name);

            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

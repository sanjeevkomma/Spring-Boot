package com.demo.service;

import com.demo.grpc.OrderRequest;
import com.demo.grpc.OrderResponse;
import com.demo.grpc.OrderServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class OrderGrpcService extends OrderServiceGrpc.OrderServiceImplBase {

    @Override
    public void getOrder(OrderRequest request,
                         StreamObserver<OrderResponse> responseObserver) {

        OrderResponse response = OrderResponse.newBuilder()
                .setOrderId(request.getOrderId())
                .setProductName("MacBook Pro")
                .setPrice(2499.99)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

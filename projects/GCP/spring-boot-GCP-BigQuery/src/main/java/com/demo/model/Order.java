package com.demo.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Order {
    private String orderId;
    private String customerId;
    private Double amount;
    private String status;
}
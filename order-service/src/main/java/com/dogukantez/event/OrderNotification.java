package com.dogukantez.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderNotification {
    private String orderId;
    private String userId;
    private String productName;
    private int quantity;
    private double price;
    private String orderStatus;
}

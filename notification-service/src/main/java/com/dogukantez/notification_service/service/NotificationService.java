package com.dogukantez.notification_service.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

    @KafkaListener(topics = "order-placed",groupId = "notification-service")
    public void getOrderNumber(String orderId){
        log.info("Received order id: {}",orderId);

    }
}

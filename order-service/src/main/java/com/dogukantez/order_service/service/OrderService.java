package com.dogukantez.order_service.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class OrderService {
    private final KafkaTemplate<String,String> kafkaTemplate;

    @Scheduled(fixedRate = 2000)
    public void processOrder(){
       final String orderId = UUID.randomUUID().toString();
       log.info("Processing order with id:" +orderId);

       kafkaTemplate.send("order-placed",orderId);
        log.info("Message sent to Kafka topic: order-placed with orderId: {}", orderId);
    }

}

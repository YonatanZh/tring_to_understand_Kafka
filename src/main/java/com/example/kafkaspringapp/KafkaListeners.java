package com.example.kafkaspringapp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "text-topic", groupId = "group_id")
    public void Listener(String message){
        System.out.println("Received message: " + message);
    }
}

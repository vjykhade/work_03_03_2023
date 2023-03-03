package com.vjykhade.kafka.web.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "KafkaFirst", groupId = "groupId")
    void listener(String data)
    {
        System.out.println("Listener Received :" +data+" :)");
    }
}

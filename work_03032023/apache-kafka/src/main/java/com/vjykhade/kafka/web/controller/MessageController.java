package com.vjykhade.kafka.web.controller;

import com.vjykhade.kafka.web.record.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/v1/messages")
public class MessageController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/api/v1/messages")
    public void publish(@RequestBody MessageRequest messageRequest)
    {
        kafkaTemplate.send("KafkaFirst", messageRequest.message());
    }
}

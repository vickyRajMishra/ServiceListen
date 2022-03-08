package com.example.service;

import com.example.model.Employee;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "test", groupId = "groupId")
    public void listenKafka(Employee message) throws Exception {
        System.out.println(message);
//        ObjectMapper objectMapper = new ObjectMapper();
//        Employee employee = objectMapper.readValue(message, Employee.class);
//        System.out.println(employee);
    }
}

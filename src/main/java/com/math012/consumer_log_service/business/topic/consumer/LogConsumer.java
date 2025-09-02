package com.math012.consumer_log_service.business.topic.consumer;

import com.math012.consumer_log_service.business.service.LogConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LogConsumer {

    @Autowired
    LogConsumerService service;

    @KafkaListener(
            topics = "${spring.kafka.consumer.send.log.topic}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void getLogTopic(String logDTO){
        log.info("tópico recebido: {}", logDTO);
        service.getLog(logDTO);
    }
}
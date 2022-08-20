package br.com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestListener {
	
	@KafkaListener(topics = "topic-1", groupId = "group-1")
	public void listen(String message) {
		log.info("Thread: {}", Thread.currentThread().getId());
		log.info("Received: {}", message);
	}

}

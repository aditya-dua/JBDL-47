package org.gfg.kafka.l20_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	String topic = "hello-world";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void send(String message) {
		
		kafkaTemplate.send(topic,message);
		
	}
}

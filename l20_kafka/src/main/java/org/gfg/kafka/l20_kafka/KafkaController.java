package org.gfg.kafka.l20_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	@Autowired
	KafkaSender kafkaSender;
	
	
	@GetMapping("/hw")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message has been sent to the kafka broker with topic: hello world";
	}
}

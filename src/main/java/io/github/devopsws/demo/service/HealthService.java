package io.github.devopsws.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.github.devopsws.demo.model.Message;

@RestController
public class HealthService {
	@GetMapping("/health")
	public String health() {
		return "OK";
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/health.json")
	public Message<?> healthJSON() {
		return new Message("OK");
	}
}

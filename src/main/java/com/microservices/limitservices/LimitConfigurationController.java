package com.microservices.limitservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitservices.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {

	private final Configuration configuration;
	
	
	public LimitConfigurationController(Configuration configuration) {
		this.configuration = configuration;
	}


	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitFromConfiguration() {
		return new LimitConfiguration(configuration.getMin(),configuration.getMax());
	}
}

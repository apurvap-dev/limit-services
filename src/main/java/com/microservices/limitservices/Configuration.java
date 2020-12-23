package com.microservices.limitservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-services")
public class Configuration {

	private int min;
	private int max;
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
}

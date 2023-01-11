package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class DemoRestAPIEurekaClient {
	
	@GetMapping("/status/check")
	public String getStaus() {
		return "Connected";
	}
	

}

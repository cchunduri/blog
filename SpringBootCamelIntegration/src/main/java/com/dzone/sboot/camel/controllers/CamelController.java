package com.dzone.sboot.camel.controllers;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {
	
	@Autowired
	CamelContext camelContext;
	
	@Autowired
	ProducerTemplate producerTemplate;
	
	@RequestMapping(value = "/")
	public void startCamel() {
		producerTemplate.sendBody("direct:firstRoute", "Calling via Spring Boot Rest Controller");
	}
}

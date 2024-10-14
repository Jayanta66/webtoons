package com.webtoons.webtoons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webtoons.webtoons.service.ServiceLayer;

@RestController
public class Controller {

	
	private  ServiceLayer serviceLayer;
	
	@Autowired
	public void HomeController(ServiceLayer serviceLayer) {
		this.serviceLayer = serviceLayer;
	}
	
	@GetMapping("/")
	public String getDate() {
		return serviceLayer.consumeAPI();
	}
}

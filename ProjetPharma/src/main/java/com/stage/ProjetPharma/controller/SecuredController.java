package com.stage.ProjetPharma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secured")
public class SecuredController {

	@GetMapping
	public String getSecuredString() {
		return "Endpoint sécurisé"; 
	}
	
	@GetMapping("/admin")
	public String getAdminEndpoint() {
		return "Endpoint Admin Sécurisé";
	}
}

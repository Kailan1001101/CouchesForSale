package com.kailan.couchesforsale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CouchesforsaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchesforsaleApplication.class, args);
	}
	@GetMapping("/")
	public String home() {
		return "Welcome!";
	}
}

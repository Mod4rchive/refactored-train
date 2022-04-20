package com.jtorres.websimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AplicacionWebSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionWebSimpleApplication.class, args);
	}

	@GetMapping("/")
	public String entrance() {
		return String.format("Buenas tardes chile");
	}

}

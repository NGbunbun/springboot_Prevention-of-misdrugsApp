package com.example.preventionofmisdrugs;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PreventionOfMisdrugsAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(PreventionOfMisdrugsAppApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}
}

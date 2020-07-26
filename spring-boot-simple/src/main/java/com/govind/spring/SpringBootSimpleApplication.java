package com.govind.spring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootSimpleApplication.class, args);
		SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
				app.setBannerMode(Banner.Mode.OFF);
				app.run(args);
	}

}

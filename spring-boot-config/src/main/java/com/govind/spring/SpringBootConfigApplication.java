package com.govind.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootConfigApplication {
	private static Logger log = LoggerFactory.getLogger(SpringBootConfigApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigApplication.class, args);
	}

	/*
	 * @Value("${server.ip}") String serverIp;
	 * 
	 * @Bean CommandLineRunner values() { return args -> {
	 * log.info(" > The Server IP is: " + serverIp); }; }
	 */

	@Value("${myapp.server-ip}")
	String serverIp;

	@Autowired
	MyAppProperties props;

	@Bean
	CommandLineRunner values() {
		return args -> {
			log.info(" > The Server IP is: " + serverIp);
			log.info(" > App Name: " + props.getName());
			log.info(" > App Info: " + props.getDescription());
		};
	}

	
}

package com.example.AdressBookApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@Slf4j
public class AdressBookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdressBookAppApplication.class, args);
		log.info("Address Book App Started");
	}

}

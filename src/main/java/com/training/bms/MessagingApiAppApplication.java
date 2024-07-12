package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {

@GetMapping("enjoyweekend")

public String printGreetings() {
	return(" Saturday and Sunday");
	}

@GetMapping("sunday")

public String printSunday() {
	return(" party hard ");
	}


public static void main(String[] args) {
	SpringApplication.run(MessagingApiAppApplication.class, args);
	System.out.println(" Hi sruthi, i have started today");
	
  }



}

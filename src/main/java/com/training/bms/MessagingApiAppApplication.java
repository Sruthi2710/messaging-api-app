package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {



public static void main(String[] args) {
	SpringApplication.run(MessagingApiAppApplication.class, args);
	System.out.println(" Hi sruthi, i have started today");
	
  }

public void printGreetings() {
   System.out.println(" Hi Oracle");
}

}

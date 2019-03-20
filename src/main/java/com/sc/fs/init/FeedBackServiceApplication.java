package com.sc.fs.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sc.fs")
public class FeedBackServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeedBackServiceApplication.class, args);
	}
}

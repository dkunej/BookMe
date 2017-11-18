package com.bookme.BookMe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BookMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMeApplication.class, args);
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyecto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1Application.class, args);
		
		System.out.println("hola mundo");
		
		int a;
		int b;
		
		a = 5;
		b = 20;
		
		System.out.println("la multi es: " + a*b);
	}

}

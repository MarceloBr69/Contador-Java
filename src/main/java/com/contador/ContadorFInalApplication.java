package com.contador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.controlador")
public class ContadorFInalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContadorFInalApplication.class, args);
	}

}

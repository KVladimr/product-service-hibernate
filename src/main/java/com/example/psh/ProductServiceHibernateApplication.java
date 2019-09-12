package com.example.psh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class ProductServiceHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceHibernateApplication.class, args);
	}

}

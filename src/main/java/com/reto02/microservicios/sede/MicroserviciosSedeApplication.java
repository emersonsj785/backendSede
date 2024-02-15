package com.reto02.microservicios.sede;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosSedeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosSedeApplication.class, args);
	}

}

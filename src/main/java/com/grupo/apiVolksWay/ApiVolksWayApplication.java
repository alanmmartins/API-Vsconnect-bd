package com.grupo.apiVolksWay;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API VolksWay" , version = "1.0.0" , description = "Swagger da API VolksWay"))
public class ApiVolksWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiVolksWayApplication.class, args);
	}

}

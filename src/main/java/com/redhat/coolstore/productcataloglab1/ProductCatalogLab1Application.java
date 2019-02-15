package com.redhat.coolstore.productcataloglab1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductCatalogLab1Application {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(ProductCatalogLab1Application.class);

		logger.debug("Ingresé al debug de la clase de prueba");
		logger.info("Esta es una prueba de generación logs");
		logger.error("Error es una prueba de generación logs");
		SpringApplication.run(ProductCatalogLab1Application.class, args);

		System.out.println("Prueba system out	");


	}

}


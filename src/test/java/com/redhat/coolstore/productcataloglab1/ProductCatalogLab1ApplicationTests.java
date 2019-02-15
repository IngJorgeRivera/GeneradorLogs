package com.redhat.coolstore.productcataloglab1;

import com.redhat.coolstore.productcataloglab1.service.ProductCatalogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCatalogLab1ApplicationTests {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void contextLoads() {
	}

	@Autowired
	private ProductCatalogService productCatalogService;

	@Test
	public void testDefaultProductList() {

		logger.debug("Ingresé al debug de la clase de prueba");
		logger.info("Esta es una prueba de generación logs");
		String message = productCatalogService.sayHello();
		assertTrue(message!=null);
		assertEquals(message,"Hola mundo!");
	}

}


package com.bhagyeshree.spring.validate.api;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Assert;

import com.bhagyeshree.spring.validate.api.service.VinService;

import antlr.collections.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestVinRestTemplates {

	private static final String BASE_URL = "https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/%3CVIN%3E?format=json";

	@Autowired
	private MockMvc mock;

	@MockBean
	private VinService vinService;

	@Autowired
	private RestTemplate restTemplate;
	
	

	@Test
	public void test_get_all_vin_getForObject() {
		RestTemplate template = new RestTemplate();
		// List<Results> listofvin = template.getForObject(BASE_URL, List.class);
		// assertNotNull(listofvin);

	}

	@Test
	public void vinTestParsing() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/%3CVIN%3E?format=json", String.class);
		System.out.println(response);

	}

	@Test
	public void test_get_all_vin_getForEntity() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/%3CVIN%3E?format=json", String.class);
		assertEquals(response.getStatusCode().value(), 200);

	}

	@Test
	public void test_get_all_vin_failed_Exception() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(
				"https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/%3CVIN%3E?format=json", HttpMethod.DELETE,
				null, String.class);
		assertTrue(response.getStatusCode().is2xxSuccessful());

	}

}

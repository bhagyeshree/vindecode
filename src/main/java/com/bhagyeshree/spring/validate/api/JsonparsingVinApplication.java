package com.bhagyeshree.spring.validate.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JsonparsingVinApplication {

@Bean
public RestTemplate getRestTemplate()
{
	return new RestTemplate();
}
	
	
	public static void main(String[] args) {
		SpringApplication.run(JsonparsingVinApplication.class, args);
		
	}
	
	
	//I tried this not getting the response 
	
	
//	public void run(String... args) throws Exception{
	
//		RestTemplate restTemplates = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		String url = "https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/%3CVIN%3E?format=json";
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//		ResponseEntity< String> response = restTemplates.exchange(url, HttpMethod.GET, entity, String.class);
//		System.out.println(response);
//	}
	

}

package com.bhagyeshree.spring.validate.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/myapp")
public class VinController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/vinnumber")
	public ResponseEntity getVinNumber()
	{
		
		String url = "https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/%3CVIN%3E?format=json";
		//Object[] objects= restTemplate.getForObject(url , Object[].class);
		Object[] objects= restTemplate.getForObject(url , Object[].class);

		return Arrays.asList(objects);
		
		return new ResponseEntity;
	
		//System.out.println(objects);
	
	}

}

package com.javaegitimleri.petclinic.web;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.javaegitimleri.petclinic.model.Owner;

public class PetClinicRestTest {
	
	private RestTemplate restTemplate;
	
	@Before
	public void setup() {
		restTemplate =  new RestTemplate();		
	}
	
	@Test
	public void testGetOwnerById() {
		ResponseEntity<Owner> response = restTemplate.getForEntity("http://localhost:8080/rest/owner/5", Owner.class);
		MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
	}

}
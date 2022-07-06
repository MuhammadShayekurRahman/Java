package com.qa.may.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.may.entity.Car;

@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void testCreate() throws Exception{
		Car testCar = new Car(null, "BMW", "M3", "Saloon", false);
		String testCarAsJSON = this.mapper.writeValueAsString(testCar);
		RequestBuilder req = post("/createCar").content(testCarAsJSON).contentType(MediaType.APPLICATION_JSON);
		
		ResultMatcher checkStatus = status().isCreated();
		Car createdCar = new Car(1, "BMW", "M3", "Saloon", false);
		String createdCarAsJSON = this.mapper.writeValueAsString(createdCar);
		ResultMatcher checkBody = content().json(createdCarAsJSON);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
}

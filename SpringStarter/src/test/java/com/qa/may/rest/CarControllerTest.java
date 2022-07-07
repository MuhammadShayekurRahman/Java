package com.qa.may.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.may.entity.Car;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:car-schema.sql",
"classpath:car-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
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
		Car createdCar = new Car(2, "BMW", "M3", "Saloon", false);
		String createdCarAsJSON = this.mapper.writeValueAsString(createdCar);
		ResultMatcher checkBody = content().json(createdCarAsJSON);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test 
	void testGetCars() throws Exception{
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(1, "Audi", "A4", "Saloon", false));
		String listCarsAsJSON = this.mapper.writeValueAsString(cars);
		this.mvc.perform(get("/listAll")).andExpect(status().isOk()).andExpect(content().json(listCarsAsJSON));
	}
	
	@Test
	void testDelete() throws Exception {
		this.mvc.perform(delete("/removeCar/1")).andExpect(status().isNoContent());
		
	}
	
	
}

	
	

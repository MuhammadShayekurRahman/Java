package com.qa.may.rest;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.may.entity.Car;

@RestController
public class CarController {
	
	private List<Car> cars = new ArrayList<>();
	
	
	@GetMapping("/demoCar")
	public Car car() {
		Car audi = new Car("Audi", "A5", "Saloon", false);
		return audi;
	}
	
	@PostMapping("/createCar")
	public Car create(@RequestBody Car newCar) {
		System.out.println("Created new Car: " + newCar);
		this.cars.add(newCar);
		return this.cars.get(this.cars.size()-1);
	}
	
	@PatchMapping("/updateCar/{id}")
	public void update(@PathVariable int id, @PathParam("make") String make, @PathParam("model") String model, @PathParam("type") String type, @PathParam("electric") boolean electric) {
		System.out.println(id);
		System.out.println(make);
		System.out.println(model);
		System.out.println(type);
		System.out.println(electric);
	}
	
	@DeleteMapping("/removeCar/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("ID: " + id);
	}
	
}

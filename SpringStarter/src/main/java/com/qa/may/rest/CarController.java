package com.qa.may.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	List<Car> cars = new ArrayList<>();
	
	
	@GetMapping("/demoCar")
	public Car car() {
		Car car = new Car(1, "Audi", "A4", "Saloon", false);
		return car;
		
	}
	
	@PostMapping("/createCar")
	public Car create(@RequestBody Car newCar) {
		System.out.println("Created new Car: " + newCar);
		this.cars.add(newCar);
		return this.cars.get(this.cars.size()-1);
	}
	
	@GetMapping("/listAll")
	public List<Car> getCars(){
		return cars;
	}
	
	@GetMapping("/search/{id}")
	public Car getCarId(@PathVariable("id") int id) {
		return this.cars.get(id);
		
	}
	
	
	
	@PatchMapping("/updateCar/{id}")
	public void update(@PathVariable int id, @PathParam("make") String make, @PathParam("model") String model, @PathParam("type") String type, @PathParam("electric") boolean electric) {
		System.out.println(id);
		System.out.println(make);
		System.out.println(model);
		System.out.println(type);
		System.out.println(electric);
		
		Car toUpdate = this.cars.get(id);
		toUpdate.setId(id);
		toUpdate.setMake(make);
		toUpdate.setModel(model);
		toUpdate.setType(type);
		toUpdate.setElectric(electric);
		
	}
	
	@DeleteMapping("/removeCar/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("ID: " + id);
		this.cars.remove(id);
	}
	
}

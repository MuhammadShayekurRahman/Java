package com.qa.may.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Car> create(@RequestBody Car newCar) {
		System.out.println("Created new Car: " + newCar);
		this.cars.add(newCar);
		Car created = this.cars.get(this.cars.size()-1);
		return new ResponseEntity<Car>(created, HttpStatus.CREATED);
	}
	
	@GetMapping("/listAll")
	public ResponseEntity<List<Car>> getCars(){
		return new ResponseEntity<List<Car>>(this.cars, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Car> getCarId(@PathVariable("id") int id) {
		return new ResponseEntity<Car>(this.cars.get(id), HttpStatus.ACCEPTED);
		
	}
	
	
	
	@PatchMapping("/updateCar/{id}")
	public ResponseEntity<Car> update(@PathVariable int id, @PathParam("make") String make, @PathParam("model") String model, @PathParam("type") String type, @PathParam("electric") boolean electric) {
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
		
		return new ResponseEntity<Car>(toUpdate, HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/removeCar/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		System.out.println("ID: " + id);
		this.cars.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

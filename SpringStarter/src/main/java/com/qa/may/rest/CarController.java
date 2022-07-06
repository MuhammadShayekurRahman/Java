package com.qa.may.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.qa.may.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	private CarService service;
	
	@GetMapping("/demoCar")
	public Car car() {
		Car car = new Car(1, "Audi", "A4", "Saloon", false);
		return car;
		
	}
	
	@PostMapping("/createCar")
	public ResponseEntity<Car> create(@RequestBody Car newCar) {
		Car created = this.service.create(newCar);
		return new ResponseEntity<Car>(created, HttpStatus.CREATED);
	}
	
	@GetMapping("/listAll")
	public List<Car> getCars(){
		return this.service.getCars();
	}
	
	@GetMapping("/search/{id}")
	public Car getCarId(@PathVariable("id") int id) {
		
		return this.service.getCarId(id);
		
	}
	
	
	
	@PatchMapping("/updateCar/{id}")
	public ResponseEntity<Car> update(@PathVariable int id, @PathParam("make") String make, @PathParam("model") String model, @PathParam("type") String type, @PathParam("electric") boolean electric) {

		return new ResponseEntity<Car>(this.service.update(id, make, model, type, electric), HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/removeCar/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		this.service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

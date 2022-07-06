package com.qa.may.service;

import java.util.List;

import com.qa.may.entity.Car;

public interface CarService {
	Car getCarId(int id);
	
	List<Car> getCars();
	
	Car create(Car newCar);
	
	Car update(int id, String make, String model, String type, boolean electric);
	
	void delete(int id);
}

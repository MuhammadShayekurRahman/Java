package com.qa.may.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.may.entity.Car;

@Service
public class CarServiceList implements CarService {
	private List<Car> cars = new ArrayList<>();
	
	@Override
	public Car getCarId(int id) {
		return this.cars.get(id);
	}

	@Override
	public List<Car> getCars() {
		return this.cars;
	}

	@Override
	public Car create(Car newCar) {
		this.cars.add(newCar);
		return this.cars.get(this.cars.size()-1);
	}

	@Override
	public Car update(int id, String make, String model, String type, boolean electric) {
		Car toUpdate = this.cars.get(id);
		toUpdate.setId(id);
		toUpdate.setMake(make);
		toUpdate.setModel(model);
		toUpdate.setType(type);
		toUpdate.setElectric(electric);
		return toUpdate;
	}

	@Override
	public void delete(int id) {
		this.cars.remove(id);
	}

}

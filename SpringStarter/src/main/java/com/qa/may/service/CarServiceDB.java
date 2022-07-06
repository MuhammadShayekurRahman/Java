package com.qa.may.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.qa.may.entity.Car;
import com.qa.may.repo.CarRepo;

@Service
@Primary
public class CarServiceDB implements CarService {

	@Autowired
	private CarRepo repo;
	
	@Override
	public Car getCarId(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public List<Car> getCars() {
		return this.repo.findAll();
	}

	@Override
	public Car create(Car newCar) {
		return this.repo.save(newCar);
	}

	@Override
	public Car update(int id, String make, String model, String type, boolean electric) {
		Car toUpdate = this.repo.getById(id);
		toUpdate.setId(id);
		toUpdate.setMake(make);
		toUpdate.setModel(model);
		toUpdate.setType(type);
		toUpdate.setElectric(electric);
		return this.repo.save(toUpdate);
	}

	@Override
	public void delete(int id) {
		this.repo.deleteById(id);
	}

}

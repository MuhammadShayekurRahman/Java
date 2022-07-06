package com.qa.may.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.may.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{

}

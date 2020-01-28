package com.developia.hibernate.service.impl;

import com.developia.hibernate.entity.Car;
import com.developia.hibernate.repository.CarRepository;
import com.developia.hibernate.service.CarService;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;


    }

    @Override
    public void save(Car car) {
        carRepository.save(car);

    }

    @Override
    public Iterable<Car> findAll() {
        return carRepository.findAll();
    }
}

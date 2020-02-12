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


    @Override
    public Car findById(Long id) {
        return null;
    }

    @Override
    public Car findByName(String name) {
        return null;
    }

    @Override
    public Car findByColor(String color) {
        return null;
    }

    @Override
    public Car findByYear(Integer year) {
        return null;
    }

    @Override
    public void update(Car car) {

    }

    @Override
    public void delete(Long id) {
        Car car = carRepository.findById(id).get();
        carRepository.delete(car);

    }
}

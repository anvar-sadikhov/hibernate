package com.developia.hibernate.service;

import com.developia.hibernate.entity.Car;

public interface CarService {
    void save(Car car);

    Iterable<Car> findAll();

    Car findById(Long id);

    Car findByName(String name);

    Car findByColor(String color);

    Car findByYear(Integer year);

    void update(Car car);

    void delete(Long id);

}

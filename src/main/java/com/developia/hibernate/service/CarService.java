package com.developia.hibernate.service;

import com.developia.hibernate.entity.Car;

public interface CarService {
    void save(Car car);

    Iterable<Car> findAll();
}

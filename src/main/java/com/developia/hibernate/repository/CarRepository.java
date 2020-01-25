package com.developia.hibernate.repository;

import com.developia.hibernate.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}

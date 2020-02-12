package com.developia.hibernate.controller;

import com.developia.hibernate.entity.Car;
import com.developia.hibernate.service.CarService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/car")
public class CarRestController {

    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/save")
    public void create(@RequestBody Car car) {
        carService.save(car);
        System.out.println(car.getName());

    }

    @GetMapping("/delete/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.delete(id);
    }


}

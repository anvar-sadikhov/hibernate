package com.developia.hibernate.controller;

import com.developia.hibernate.entity.Car;
import com.developia.hibernate.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/saveCar")
    public void create(@RequestBody Car car) {
        carService.save(car);
        System.out.println(car.getName());

    }

    @GetMapping("/cars")
    public String getCar(Model model) {
        Iterable<Car> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }

}

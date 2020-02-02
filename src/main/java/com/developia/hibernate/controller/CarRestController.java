package com.developia.hibernate.controller;

import com.developia.hibernate.entity.Car;
import com.developia.hibernate.service.CarService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarRestController {

    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/car/save")
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

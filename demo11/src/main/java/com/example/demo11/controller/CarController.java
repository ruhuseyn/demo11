package com.example.demo11.controller;

import com.example.demo11.entity.Car;
import com.example.demo11.entity.User;
import com.example.demo11.manager.CarManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {
    private final CarManager carManager ;

    public CarController(CarManager carManager) {
        this.carManager = carManager;
    }
    @GetMapping("/cars")
    public List<Car> getAll(){
        return carManager.getAll();
    }
    @GetMapping("/cars/{id}")
    public Car getById(@PathVariable int id){
        return carManager.getById(id);
    }


}

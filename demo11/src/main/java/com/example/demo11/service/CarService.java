package com.example.demo11.service;

import com.example.demo11.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll() ;
    Car getById(int id );
    Car saveCar(Car car);
    void deleteCar(int id) ;
}

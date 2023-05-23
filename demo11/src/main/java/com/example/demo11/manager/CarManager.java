package com.example.demo11.manager;

import com.example.demo11.entity.Car;
import com.example.demo11.repository.CarRepository;
import com.example.demo11.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private final CarRepository carRepository ;

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public Car getById(int id) {
        return carRepository.findById(id).get();
    }

    @Override
    public Car saveCar(Car car) {
        carRepository.save(car);
        return car ;
    }

    @Override
    public void deleteCar(int id) {
carRepository.deleteById(id);
    }
}

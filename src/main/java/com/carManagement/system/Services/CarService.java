package com.carManagement.system.Services;

import com.carManagement.system.Models.Car;
import com.carManagement.system.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarService {
    @Autowired
    private CarRepository carRepository;


    public Car addCar(Car car) {
        return carRepository.save(car);
    }
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car updateCar(int id, Car carDetails) {
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro un carro con ese ID: " + id));
        car.setMarca(carDetails.getMarca());
        car.setModelo(carDetails.getModelo());
        car.setAnio(carDetails.getAnio());
        car.setColor(carDetails.getColor());
        car.setPrecio(carDetails.getPrecio());
        return carRepository.save(car);
    }

    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }
    public Car getCarById(int id) {
        return carRepository.findById(id).get();
    }




}

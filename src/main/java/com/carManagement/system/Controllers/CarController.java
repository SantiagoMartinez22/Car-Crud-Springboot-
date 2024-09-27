package com.carManagement.system.Controllers;

import com.carManagement.system.Models.Car;
import com.carManagement.system.Services.CarService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;
//prueba con response para mirar que se ingresen correctamente
   // @PostMapping("/cars")
   // public ResponseEntity<Car> addCar(@RequestBody Car car) {
       // Car savedCar = carService.addCar(car);
        //return ResponseEntity.status(HttpStatus.CREATED).body(savedCar);
   // }
    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @GetMapping("/cars")
    public List<Car> cars(){
        return carService.getAllCars();
    }

    @PutMapping("/cars/{id}")
    public void updateCar( @PathVariable int id, @RequestBody Car carDetails) {
        Car updatedCar =carService.getCarById(id);
        if(updatedCar != null){
            carService.updateCar(id, carDetails);
        }

    }
    @DeleteMapping("/cars/{id}")
    public void deleteCar( @PathVariable int id) {
        Car updatedCar =carService.getCarById(id);
        if(updatedCar != null){
            carService.deleteCar(id);
        }

    }

}

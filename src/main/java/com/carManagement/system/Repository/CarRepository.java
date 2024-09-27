package com.carManagement.system.Repository;

import com.carManagement.system.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository  extends JpaRepository<Car, Integer> {
    List<Car> findByMarca(String marca);
    List<Car> findByModelo(String modelo);
}

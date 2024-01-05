package com.sinanyagsagan.assignment.service;

import com.sinanyagsagan.assignment.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> carList;
    public CarService() {
        this.carList = new ArrayList<>();
    }
    public void addCar(Car car){
        carList.add(car);
    }
    public List<Car> getAllCars() {
        return carList;
    }
}
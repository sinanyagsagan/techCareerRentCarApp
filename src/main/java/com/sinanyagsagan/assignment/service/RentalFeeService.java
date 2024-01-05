package com.sinanyagsagan.assignment.service;

import com.sinanyagsagan.assignment.enums.*;
import com.sinanyagsagan.assignment.model.Car;
import com.sinanyagsagan.assignment.model.Customer;
import com.sinanyagsagan.assignment.model.RentalFee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalFeeService {

     private static final double defaultPrice = 300;
     private static final int defaultMonthlyDay = 30;

    public List<String> rentCarPrice(List<Car> cars,
                               Customer customer,
                               RentalFee rentalFee){

        List<Car> showCarsDependsCustomerType = 
                showCars(cars,customer.getCustomerType());

       List<String> rentCarDetailsList = new ArrayList<>();

        for (Car car : showCarsDependsCustomerType){

          String rentCarDetails =  "ID: " + car.getId()
                    + ", Car Type: " + car.getCarType()
                    + ", Color: " + car.getColor()
                    + ", BaggageCapacity: " + car.getBaggageCapacity()
                    + ", FuelType: " + car.getFuelType()
                    + ", Customer Type: " +  customer.getCustomerType()
                    + ", Car Price: " + carPricing(rentalFee, car) + " Turkish Lira" ;

            rentCarDetailsList.add(rentCarDetails);
        }
        return rentCarDetailsList;
    }

    private double carPricing(RentalFee rentalFee, Car car){

        // pricing functions may be added to this method

        double price = defaultPrice;

        if(car.getFuelType().equals(FuelType.GAS)
                && car.getBaggageCapacity().equals(BaggageCapacity.MEDIUM)){
           price = price + dieselAndHighBaggageCapacityCars();
        }

        if (car.getCarType().equals(CarType.SUV)){
            rentalFee.setDailyPrice(price);
            return rentalFee.getDailyPrice();
        }

        rentalFee.setMonthlyPrice(price * defaultMonthlyDay);
       return rentalFee.getMonthlyPrice();
    }

    private double dieselAndHighBaggageCapacityCars(){
        double dieselCarsDailyPlus = 10;
        double mediumBaggageCapacityPlus = 10;
        return  dieselCarsDailyPlus + mediumBaggageCapacityPlus;
    }

    public List<Car> showCars(List<Car> cars, CustomerType customerType){

        List<Car> hatchbackCars =  cars.stream().filter(car -> car.getCarType() == CarType.HATCHBACK)
                .collect(Collectors.toList());

        if (customerType.equals(CustomerType.INDIVIDUAL)) return hatchbackCars;
        return cars;
    }
}

package com.sinanyagsagan.assignment;

import com.sinanyagsagan.assignment.enums.*;
import com.sinanyagsagan.assignment.model.Car;
import com.sinanyagsagan.assignment.model.Customer;
import com.sinanyagsagan.assignment.model.RentalFee;
import com.sinanyagsagan.assignment.service.CarService;
import com.sinanyagsagan.assignment.service.CustomerService;
import com.sinanyagsagan.assignment.service.RentalFeeService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        RentalFeeService rentalFeeService = new RentalFeeService();
        RentalFee rentalFee = new RentalFee();

        CustomerService customerService = new CustomerService();
        Customer customerIndividual = new Customer();
        Customer customerCompany = new Customer();

        CarService carService = new CarService();
        Car carOne = new Car();
        Car carTwo = new Car();
        Car carThree = new Car();
        Car carFour = new Car();
        Car carFive = new Car();

        carOne.setId(1000L);
        carOne.setCarType(CarType.SUV);
        carOne.setColor(Color.WHITE);
        carOne.setBaggageCapacity(BaggageCapacity.HIGH);
        carOne.setFuelType(FuelType.GASOLINE);

        carTwo.setId(2000L);
        carTwo.setCarType(CarType.HATCHBACK);
        carTwo.setColor(Color.BLUE);
        carTwo.setBaggageCapacity(BaggageCapacity.LOW);
        carTwo.setFuelType(FuelType.DIESEL);

        carThree.setId(3000L);
        carThree.setCarType(CarType.SEDAN);
        carThree.setColor(Color.BLACK);
        carThree.setBaggageCapacity(BaggageCapacity.MEDIUM);
        carThree.setFuelType(FuelType.GAS);

        carFour.setId(4000L);
        carFour.setCarType(CarType.HATCHBACK);
        carFour.setColor(Color.RED);
        carFour.setBaggageCapacity(BaggageCapacity.MEDIUM);
        carFour.setFuelType(FuelType.GAS);

        carFive.setId(5000L);
        carFive.setCarType(CarType.SUV);
        carFive.setColor(Color.RED);
        carFive.setBaggageCapacity(BaggageCapacity.MEDIUM);
        carFive.setFuelType(FuelType.GAS);


        carService.addCar(carOne);
        carService.addCar(carTwo);
        carService.addCar(carThree);
        carService.addCar(carFour);
        carService.addCar(carFive);

        customerIndividual.setCustomerType(CustomerType.INDIVIDUAL);
        customerCompany.setCustomerType(CustomerType.COMPANY);

        customerService.addCustomer(customerIndividual);
        customerService.addCustomer(customerCompany);


        List<Car> allCars = carService.getAllCars();
         //showAllCars(allCars);

        List<Customer> allCustomers = customerService.getAllCustomers();
        // showAllCustomers(allCustomers);

        /*
         When individuals and companies want to see the car prices,
         it will be enough to change the
         customerCompany and customerIndividual part in the rentCarPrice() method.
         * **/

        List<String> rentCarsDetailsList =
                rentalFeeService.rentCarPrice(allCars, customerCompany, rentalFee);
        showAllRentCars(rentCarsDetailsList);

    }

    private static void showAllCars(List<Car> allCars){
        for (Car car : allCars) {
            System.out.println(
                    "ID: " + car.getId()
                            + ", Car Type: " + car.getCarType()
                            + ", Color: " + car.getColor()
                            + ", BaggageCapacity: " + car.getBaggageCapacity()
                            + ", FuelType: " + car.getFuelType()
            );
        }
    }
    private static void showAllCustomers(List<Customer> allCustomers){

        for (Customer customer : allCustomers){
            System.out.println(
                    "Customer Type : " + customer.getCustomerType()
            );
        }

    }
    private static void showAllRentCars(List<String> rentCarsDetailsList){
        for (String rentCars : rentCarsDetailsList){
            System.out.println(rentCars);
        }
    }
}

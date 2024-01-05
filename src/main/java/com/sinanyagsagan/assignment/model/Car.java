package com.sinanyagsagan.assignment.model;

import com.sinanyagsagan.assignment.enums.BaggageCapacity;
import com.sinanyagsagan.assignment.enums.CarType;
import com.sinanyagsagan.assignment.enums.Color;
import com.sinanyagsagan.assignment.enums.FuelType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    private long Id;
    private CarType carType;
    private Color color;
    private BaggageCapacity baggageCapacity;
    private FuelType fuelType;

}

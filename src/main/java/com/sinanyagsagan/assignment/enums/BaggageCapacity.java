package com.sinanyagsagan.assignment.enums;

public enum BaggageCapacity {
    HIGH(400), MEDIUM(300), LOW(200);

    private final double capacity;

    BaggageCapacity(double capacity){
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

}

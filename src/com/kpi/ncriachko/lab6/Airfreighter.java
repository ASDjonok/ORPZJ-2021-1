package com.kpi.ncriachko.lab6;

public class Airfreighter extends Plane{
    private final String cargoType;
    private final double cargoAssessment;
    private final String hatchType;
    public Airfreighter(String name, int passengerCapacity, double liftingCapacity, double fuelConsumption,
                        String cargoType, double cargoAssessment, String hatchType) {
        super(name, passengerCapacity, liftingCapacity, fuelConsumption);
        this.cargoType = cargoType;
        this.cargoAssessment = cargoAssessment;
        this.hatchType = hatchType;
    }

    public String getCargoType() {
        return cargoType;
    }

    public double getCargoAssessment() {
        return cargoAssessment;
    }

    public String getHatchType() {
        return hatchType;
    }
}

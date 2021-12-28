package com.kpi.ncriachko.lab6;

public abstract class Plane implements Comparable<Plane>{
    protected final String name;
    protected final int passengerCapacity;
    protected final double liftingCapacity;
    protected final double fuelConsumption;
    protected Plane(String name, int passengerCapacity, double liftingCapacity, double fuelConsumption) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.liftingCapacity = liftingCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int compareTo(Plane plane) {
        return (int) (this.fuelConsumption - plane.getFuelConsumption());
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", liftingCapacity=" + liftingCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}

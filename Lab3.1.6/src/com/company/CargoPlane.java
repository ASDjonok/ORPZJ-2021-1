package com.company;

/**
 * Класс грузовых самолетов с 3 полями (родительского класса)
 */
public class CargoPlane extends Airplane {

    /**
     * Конструктор - создание нового обьекта грузового самолета с значениями
     * @param capacity - вместительность
     * @param maxFlightRange - максимальная дистанция полета
     * @param fuelConsump - потребления горючего
     */
    public CargoPlane(Integer capacity, Integer maxFlightRange, Double fuelConsump) {
        this.maxFlightRange = maxFlightRange;
        this.fuelConsump = fuelConsump;
        this.capacity = capacity;
    }
}

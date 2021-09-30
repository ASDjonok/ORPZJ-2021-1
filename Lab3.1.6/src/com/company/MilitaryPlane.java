package com.company;

/**
 * Класс боевых самолетов с 3 полями (родительского класса)
 */
public class MilitaryPlane extends Airplane {

    /**
     * Конструктор - создание нового обьекта боевого самолета с значениями
     * @param capacity - вместительность
     * @param maxFlightRange - максимальная дистанция полета
     * @param fuelConsump - потребления горючего
     */
    public MilitaryPlane(Integer capacity, Integer maxFlightRange, Double fuelConsump) {
        this.maxFlightRange = maxFlightRange;
        this.fuelConsump = fuelConsump;
        this.capacity = capacity;
    }
}

package com.company;

/**
 * Класс самолетов с 3 полями
 */
public class Airplane  {
    /** Поле вместительность */
    private Integer capacity;
    /** Поле максимальная дистанция полета */
    private Integer maxFlightRange;
    /** Поле потребления горючего */
    private Double fuelConsump;

    public Airplane(Integer capacity, Integer maxFlightRange, Double fuelConsum) {
        this.maxFlightRange = maxFlightRange;
        this.fuelConsump = fuelConsum;
        this.capacity = capacity;
    }


    /**
     * Функция геттер вместительности
     * @return возвращает capacity самолета
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Функция геттер максимальной дистанции полета
     * @return возвращает maxFlightRange самолета
     */
    public Integer getMaxFlightRange() {
        return maxFlightRange;
    }

    /**
     * Функция геттер потребления горючего
     * @return возвращает fuelConsump самолета
     */
    public Double getFuelConsump() {
        return fuelConsump;
    }

    /**
     * Функция cеттер вместительности
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * Функция cеттер максимальной дистанции полета
     */
    public void setMaxFlightRange(Integer maxFlightRange) {
        this.maxFlightRange = maxFlightRange;
    }

    /**
     * Функция cеттер потребления горючего
     */
    public void setFuelConsump(Double fuelConsump) {
        this.fuelConsump = fuelConsump;
    }
    /**
     * Функция toString - возвращает обьект в виде строчки
     * @return возвращает строку которая состоит из полей обьекта
     */
    @Override
    public String toString() {
        return "Airplane{" +
                "capacity=" + capacity +
                ", maxFlightRange=" + maxFlightRange +
                ", fuelConsump=" + fuelConsump +
                '}';
    }

}
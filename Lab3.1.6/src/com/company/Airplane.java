package com.company;

/**
 * Класс самолетов с 3 полями
 */
abstract class Airplane  {
    /** Поле вместительность */
    Integer capacity;
    /** Поле максимальная дистанция полета */
    Integer maxFlightRange;
    /** Поле потребления горючего */
    Double fuelConsump;

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

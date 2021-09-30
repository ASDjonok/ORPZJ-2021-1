package com.company;

/**
 * Класс пассажирских самолетов с 3 полями (родительского класса) и одним своим
 */
public class PassengerPlane  extends Airplane {
    /** Поле количества сидений */
    Integer numbOfSeats;

    /**
     * Конструктор - создание нового обьекта пассажирского самолета с значениями
     * @param maxFlightRange - максимальная дистанция полета
     * @param fuelConsump - потребления горючего
     * @param numbOfSeats - количество мест
     */
    public PassengerPlane(Integer numbOfSeats, Integer maxFlightRange, Double fuelConsump) {
        this.numbOfSeats = numbOfSeats;
        this.maxFlightRange = maxFlightRange;
        this.fuelConsump = fuelConsump;
        this.capacity = 250 * numbOfSeats;
    }

}

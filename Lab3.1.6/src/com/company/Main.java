package com.company;

import java.util.ArrayList;

/**
 * Класс Main
 * @autor Ульяна Джигиль
 * @version 1.0
 */
public class Main {

    /**
     * Главная функция
     * Создает ArrayList обьектов наследников класса Airplane
     * Создает обьект авиакомпании и передает в нее ArrayList
     * Считает общюю вместительность всех самолетов и выводит в консоль
     * Сортирует самолеты по максимальной дальности полета и выводит в консоль
     * Выводит самолеты из заданого диапазона потребления горючего в консоль
     */
    public static void main(String[] args) {
        ArrayList planes = new ArrayList<>();

        PassengerPlane plane1 = new PassengerPlane(30, 10000, (double) 150);
        PassengerPlane plane2 = new PassengerPlane(130, 15000,  180.8);
        CargoPlane plane3 = new CargoPlane(5000, 20000,  300.5);
        CargoPlane plane4 = new CargoPlane(6000, 22000,  350.7);
        MilitaryPlane plane5 = new MilitaryPlane(700, 10000,  (double) 200);
        MilitaryPlane plane6 = new MilitaryPlane(3000, 140000,  420.8);

        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);
        planes.add(plane4);
        planes.add(plane5);
        planes.add(plane6);

        AirLine company = new AirLine(planes);

        company.totalCapacity();
        System.out.println(" ");
        company.sortByFlightRange();
        System.out.println(" ");
        company.findByFuel(180.0 , 350.0 );
    }
}

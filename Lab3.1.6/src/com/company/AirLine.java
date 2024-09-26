package com.company;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Класс авиакомпаний с массивом самолетов
 */
public class AirLine {
    /** Поле списка самолетов */
    ArrayList<? extends Airplane> planes;

    /**
     * Конструктор - создание нового обьекта авиакомпании с значениями
     * @param planes - список самолетов
     */
    public AirLine(ArrayList<? extends Airplane> planes) {
        this.planes = planes;
    }

    /**
     * Функция высчитывает общую вместительность авиакомпании
     * выводит результат в консоль
     */
    void totalCapacity(){
        Integer total = 0;
        for (Airplane plane : this.planes) {
            total += plane.getCapacity();
            //intValue()
        }
        System.out.println(total);
    }

    /**
     * Функция сортирует список самолетов по дальности полета
     * выводит результат в консоль
     */
    void sortByFlightRange(){
        this.planes.sort(Comparator.comparing(Airplane::getMaxFlightRange));
        this.planes.forEach(System.out::println);
    }

    /**
     * Функция выводит самолеты из заданого диапазона потребления горючего
     * выводит результат в консоль
     */
    void findByFuel(Double min, Double max){
        this.planes.stream().filter(
                (o1)->{
                    if(o1.getFuelConsump() > min && o1.getFuelConsump() < max){
                        return true;
                    }else {
                        return false;
                    }
                }
        ).forEach(System.out::println);
    }
}

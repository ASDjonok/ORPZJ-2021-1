package com.company;

import java.util.ArrayList;

/**
 * Клас слугує для створення LinkedList та роботи з його даними.
 *
 * @author Анастасія Гриценко
 * @version 1.0 24 Nov 2021
 */

public class Main {

    /**
     * Головний метод програми.
     * Створює 3 реалізації класу {@link LinkedList} на основі трьох конструкторів класу LinkedList: порожнього, в який
     * передається 1 об’єкт узагальненого класу та в який передається стандартна колекція об’єктів {@link ArrayList<Equipment>}.
     * У цьому класі відбувається тестування реалізованих методів інтерфейсу List: size(), remove() та indexOf(); також
     * за допомогою методів addFirst() та addLast() об'єкти класу {@link Equipment} додають до необхідного LinkedList, а
     * методом get() проводиться пошук індексу об'єкту.
     */
    public static void main(String[] args) {

        //Реалізація порожнього конструктору
        LinkedList<Equipment> equipment = new LinkedList<>();

        Equipment e1 = new Equipment("шолом", "сталь", 150, 15);
        Equipment e2 = new Equipment("цеп", "метал+дерево", 60, 12);
        Equipment e3 = new Equipment("набедренник", "дерево", 70, 5);
        Equipment e4 = new Equipment("кіраса", "бавовна+шкіра", 60, 12);
        equipment.addFirst(e1);
        equipment.addLast(e2);
        equipment.addLast(e3);
        equipment.addLast(e4);

        System.out.println("Використання порожнього конструктору класу LinkedList : " + equipment);
        System.out.println("Індекс елементу e1: " + equipment.get(e1));
        System.out.println("Індекс елементу e2: " + equipment.get(e2));
        System.out.println("Індекс елементу e3: " + equipment.get(e3));
        System.out.println(equipment.remove(e1));
        System.out.println("Вигляд LinkedList після видалення  елемента: " + equipment);
        System.out.println(equipment.indexOf(e4));

        System.out.println();

        //Передається один об'єкт класу Equipment
        Equipment e = new Equipment("рукавиця", "шкіра", 100, 2);
        LinkedList<Equipment> equipment2 = new LinkedList<>(e);
        System.out.println("Один об'єкт узагальненого класу Equipment передається в конструктор класу LinkedList: " +
                equipment2);

        System.out.println();

        ArrayList<Equipment> eq = new ArrayList<>();
        eq.add(new Equipment("нагрудник", "сталь", 350, 30));
        eq.add(new Equipment("наколінники", "сталь+шкіра", 280, 15));
        eq.add(new Equipment("поділ", "сталь", 90, 25));
        //Передається колекція
        LinkedList<Equipment> equipment3 = new LinkedList<>(eq);
        System.out.println("В конструктор класу LinkedList передаю колекцію: " + equipment3);

        System.out.println(equipment3.size());
        System.out.println(equipment2.size());
        System.out.println(equipment.size());

    }
}

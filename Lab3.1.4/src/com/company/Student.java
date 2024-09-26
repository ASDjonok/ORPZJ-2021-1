package com.company;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Класс студентов с 5 полями
 * @autor Ульяна Джигиль
 * @version 1.0
 */
public class Student {
    /** Поле Имя */
    private String name;
    /** Поле Фамилия */
    private String surname;
    /** Поле Отчество */
    private String patronymic;
    /** Поле номер зачетной книжки */
    private String recordBook;
    /** Поле Оценка */
    private Integer grade;

    /**
     * Конструктор - создание нового обьекта студента с значениями
     * @param name - Имя
     * @param surname - Фамилия
     * @param patronymic - Отчество
     * @param recordBook - Номер зачетной книжки
     * @param grade - Оценко
     */
    public Student(String name, String surname, String patronymic, String recordBook, Integer grade) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.recordBook = recordBook;
        this.grade = grade;
    }
    /**
     * Главная функция
     * Создает ArrayList обьектов типа Student
     * Сортирует по Фамилии и выводит в консоль
     * Сортирует по возрастанию Оценок и выводит в консоль
     */
    public static void main(String[] args) {
        //создаем пустой массив
        Student[] students = new Student[7];

        //добавляем обьекты студентов
        students[0] = new Student("Василий", "Шевченко", "Семенович", "0001", 85);
        students[1] = new Student("Виталий", "Петров", "Иванович", "0002", 80);
        students[2] = new Student("Петр", "Иванов", "Сергеевич", "0003",70);
        students[3] = new Student("Василий", "Сидоров", "Иванович", "0004", 73);
        students[4] = new Student("Ульяна", "Джигиль", "Андреевна", "0005", 90);
        students[5] = new Student("Альбина", "Суюсанова", "Муратовна","0006", 100);
        students[6] = new Student("Настя", "Гриценко", "Александровна", "0007", 100);

        //с помощью статического метода sort класса Arrays сортируем массив с компаратором по Имени
        Arrays.sort(students, Comparator.comparing(Student::getSurname));

        //выводим в консоль отсортированный массив
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //выводим пустую строку что бы две сортировки не сливались
        System.out.println(" ");

        //с помощью статического метода sort класса Arrays сортируем массив с компаратором по спаданию Оценки
        Arrays.sort(students, Comparator.comparing(Student::getGrade).reversed());

        //выводим в консоль отсортированный массив
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    /**
     * Функция геттер Имени
     * @return возвращает Имя студента
     */
    public String getName() {
        return this.name;
    }

    /**
     * Функция геттер Фамилии
     * @return возвращает Фамилию студента
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Функция геттер Отчества
     * @return возвращает Отчество студента
     */
    public String getPatronymic() {
        return this.patronymic;
    }

    /**
     * Функция геттер Номера зачетной книжки
     * @return возвращает Номер зачет ной книжки студента
     */
    public String getRecordBook() {
        return this.recordBook;
    }

    /**
     * Функция геттер Оценки
     * @return возвращает Оценку студента
     */
    public Integer getGrade() {
        return this.grade;
    }

    /**
     * Функция toString - возвращает обьект в виде строчки
     * @return возвращает строку которая состоит из полей обьекта
     */
    @Override
    public String toString() {
        return "СТУДЕНТ " +
                "Фамилия: " + this.surname +
                ", Имя: " + this.name +
                ", Отчество: " + this.patronymic +
                ", Зачетная книжка: " + this.recordBook +
                ", Балл: " + this.grade;
    }
}

package com.company;

/**
 * Клас слугує для задання полів об'єктам амуніції
 *
 * @author Анастасія Гриценко
 * @version 1.0 26 Sep 2021
 */
public class Equipment {
    /**
     * Поле - ім'я
     */
    private String name;
    /**
     * Поле - матеріал
     */
    private String material;
    /**
     * Поле - ціна
     */
    private int cost;
    /**
     * Поле - вага
     */
    private int weight;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param name     ім'я
     * @param material матеріал
     * @param cost     ціна
     * @param weight   вага
     */
    public Equipment(String name, String material, int cost, int weight) {
        this.name = name;
        this.material = material;
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("name=").append(name);
        sb.append(", material=").append(material);
        sb.append(", cost=").append(cost);
        sb.append(", weight=").append(weight);
        return sb.toString();
    }
}

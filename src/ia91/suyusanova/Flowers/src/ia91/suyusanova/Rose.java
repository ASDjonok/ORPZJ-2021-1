package ia91.suyusanova;

/**
 * Клас роз з полями батьківського класу
 */

public class Rose extends Flower{

    /**
     * Конструктор - створення нового об'екту роз з значеннями
     * @param color     - колір
     * @param length    - довжина
     * @param price     - ціна
     * @param lvlLife   - рівень життя
     */

    public Rose(String color, double length, double price, int lvlLife) {
        super(color, length, price, lvlLife);
        this.ClassName = "Rose";
    }
}

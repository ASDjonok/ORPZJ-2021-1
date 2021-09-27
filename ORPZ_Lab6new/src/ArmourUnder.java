/**
 * Клас слугує для наслідування класу Equipment.
 *
 * @author Анастасія Гриценко
 * @version 1.0 26 Sep 2021
 */
public class ArmourUnder extends Equipment {
    /**
     * Поле - колір
     */
    public String color;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param name     ім'я
     * @param material матеріал
     * @param cost     ціна
     * @param weight   вага
     * @param color    колір
     */
    public ArmourUnder(String name, String material, int cost, int weight, String color) {
        super(name, material, cost, weight);
        this.color = color;
    }

    /**
     * Функція для виводу на екран призначення амуніції.
     */
    public void action() {
        System.out.println("Keeps the knight warm");
    }

    /**
     * Функція для виводу на екран значень полів об'єктів класу.
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("name=").append(name);
        sb.append(", material=").append(material);
        sb.append(", cost=").append(cost);
        sb.append(", weight=").append(weight);
        sb.append(", color=").append(color);
        sb.append(' ');
        return sb.toString();
    }
}

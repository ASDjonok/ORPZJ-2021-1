/**
 * Клас слугує для наслідування класу Equipment.
 *
 * @author Анастасія Гриценко
 * @version 1.0 26 Sep 2021
 */
public class Weapon extends Equipment {
    /**
     * Поле - тип зброї
     */
    public String weapon_type;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param name        ім'я
     * @param material    матеріал
     * @param cost        ціна
     * @param weight      вага
     * @param weapon_type тип зброї
     */
    public Weapon(String name, String material, int cost, int weight, String weapon_type) {
        super(name, material, cost, weight);
        this.weapon_type = weapon_type;
    }

    /**
     * Функція для виводу на екран призначення амуніції.
     */
    public void action() {
        System.out.println("Is used in battles");
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
        sb.append(", weapon_type=").append(weapon_type);
        sb.append(' ');
        return sb.toString();
    }
}

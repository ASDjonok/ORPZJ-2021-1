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
    public String name;
    /**
     * Поле - матеріал
     */
    public String material;
    /**
     * Поле - ціна
     */
    public int cost;
    /**
     * Поле - вага
     */
    public int weight;

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

    /**
     * Функція для виводу на екран призначення амуніції.
     */
    public void action() {
        System.out.println("Function of different kinds of equipment");
    }
}

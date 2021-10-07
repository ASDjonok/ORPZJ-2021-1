package ip94.dolgova.Lab6;

/**
 * Клас слугує для задання полів кави
 *
 * @author Долгова Єлизавета
 * @version 1.0 7 Oct 2021
 */
public class Coffee {
    /**
     * Поле - упаковка
     */
    public String packing;
    /**
     * Поле - стан
     */
    public String state;
    /**
     * Поле - вага
     */
    public int weight;
    /**
     * Поле - ціна за кг
     */
    public int pricePerKg;
    /**
     * Поле - якість
     */
    public int quality;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param packing    упаковка (банка, пакет)
     * @param state      стан (зерно, мелена, розчинна)
     * @param weight     вага (у кг)
     * @param pricePerKg ціна за кг
     * @param quality    якість (від 1 до 10)
     */
    public Coffee(String packing, String state, int weight, int pricePerKg, int quality) {
	this.packing = packing;
	this.state = state;
	this.weight = weight;
	this.pricePerKg = pricePerKg;
	this.quality = quality;
    }

    /**
     * Функція для отримання повної ціни.
     */
    public int countTotalPrice() {
	return this.weight * this.pricePerKg;
    }
}

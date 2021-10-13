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
    private String packing;
    /**
     * Поле - стан
     */
    private String state;
    /**
     * Поле - вага
     */
    private int weight;
    /**
     * Поле - ціна за кг
     */
    private int pricePerKg;
    /**
     * Поле - якість
     */
    private int quality;

    private String placeOfGrowth;

    private int bitterness;

    private int caffeine;

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
	setPacking(packing);
	setState(state);
	setWeight(weight);
	setPrice(pricePerKg);
	setQuality(quality);
    }

    /**
     * Функція для отримання повної ціни.
     */
    public int countTotalPrice() {
	return this.weight * this.pricePerKg;
    }

    /**
     * Геттери та сеттери для приватних полів
     */

    public String getPacking() {
	return packing;
    }

    public void setPacking(String packing) {
	this.packing = packing;
    }

    public String getState() {
	return state;
    }

    public void setState(String state) {
	this.state = state;
    }

    public int getQuality() {
	return quality;
    }

    public void setQuality(int quality) {
	this.quality = quality;
    }

    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }

    public int getPrice() {
	return pricePerKg;
    }

    public void setPrice(int price) {
	this.pricePerKg = price;
    }

    public String getPlaceOfGrowth() {
	return placeOfGrowth;
    }

    public void setPlaceOfGrowth(String placeOfGrowth) {
	this.placeOfGrowth = placeOfGrowth;
    }

    public int getBitterness() {
	return bitterness;
    }

    public void setBitterness(int bitterness) {
	this.bitterness = bitterness;
    }

    public int getCaffeine() {
	return caffeine;
    }

    public void setCaffeine(int caffeine) {
	this.caffeine = caffeine;
    }
}

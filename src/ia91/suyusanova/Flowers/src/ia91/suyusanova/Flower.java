package ia91.suyusanova;
import java.util.Comparator;

/**
 * Клас квітів с 4 полями
 */

public class Flower implements Comparator<Flower> {
    /**
     * поле - колір
     */
    private String color;
    /**
     * поле - довжина
     */
    private double length;
    /**
     * поле - ціна
     */
    private double price;
    /**
     * поле - рівень життя
     */
    private int lvlLife;

    protected String ClassName;

    /**
     * конструктор
     * @param color         - колір
     * @param price         - ціна
     * @param length        - довжина
     * @param lvlLife       - рівень життя
     */

    public Flower(String color, double length, double price, int lvlLife) {
        this.color = color;
        this.length = length;
        this.price = price;
        this.lvlLife = lvlLife;
        this.ClassName = "Flower";
    }

    /**
     * Функція гетер рівня життя
     * @return повертає lvlLife квітки
     */
    public int getLvlLife() {
        return lvlLife;
    }

    /**
     * Функція сетер рівня життя
     */
    public void setLvlLife(int lvlLife) {
        this.lvlLife = lvlLife;
    }

    /**
     * Функція гетер кольору
     * @return повертає color квітки
     */
    public String getColor() {
        return color;
    }

    /**
     * Функція сетер кольору
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Функція гетер довжини
     * @return повертає length квітки
     */
    public double getLength() {
        return length;
    }

    /**
     * Функція сетер довжини
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Функція гетер ціни
     * @return повертає price квітки
     */
    public double getPrice() {
        return price;
    }

    /**
     * Функція сетер ціни
     */
    public void setPrice(double price) {
        this.price = price;
    }


    public String getClassName() { return this.ClassName; }
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Функція порівняння
     */
    @Override
    public int compare(Flower a, Flower b) {
        if(a.getLvlLife()> b.getLvlLife())
            return 1;
        else if(a.getLvlLife()< b.getLvlLife())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        String f = this.getClassName();
        String s = f + " " + this.getColor() + ", length: " + this.getLength() + "level of live: " + this.getLvlLife() +", price: " + this.getPrice() + "$";
        return s;
    }
}

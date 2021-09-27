/**
 * Клас слугує для задання полів об'єктам-лицарям.
 *
 * @author Анастасія Гриценко
 * @version 1.0 26 Sep 2021
 */
public class Knight {
    /**
     * Поле - ім'я
     */
    public String name;
    /**
     * Поле - вік
     */
    public int age;
    /**
     * Поле - країна
     */
    public String country;
    /**
     * Поле - масив з об'єктів амуніції класу {@link ArmourOut}
     */
    ArmourOut[] a1;
    /**
     * Поле - масив з об'єктів амуніції класу {@link ArmourUnder}
     */
    ArmourUnder[] au1;
    /**
     * Поле - масив з об'єктів амуніції класу {@link Weapon}
     */
    Weapon[] w1;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param name    ім'я
     * @param age     вік
     * @param country країна
     * @param a1      масив з об'єктів амуніції класу {@link ArmourOut}
     * @param au1     масив з об'єктів амуніції класу {@link ArmourUnder}
     * @param w1      масив з об'єктів амуніції класу {@link Weapon}
     */
    public Knight(String name, int age, String country, ArmourOut[] a1, ArmourUnder[] au1, Weapon[] w1) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.a1 = a1;
        this.au1 = au1;
        this.w1 = w1;
    }

    /**
     * Функція для виводу на екран значень полів об'єктів класу.
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" ");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", country=").append(country);
        sb.append(' ');
        return sb.toString();
    }
}

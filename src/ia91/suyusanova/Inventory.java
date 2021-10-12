package ia91.suyusanova;
import java.util.Comparator;
import java.util.Arrays;

/**
 * клас спортивного інвентаря з властивостями
 * @author Альбіна Суюсанова
 * @version 1.0
 */

public class Inventory {
    /**
     * поле - назва
     */
    public String name;
    /**
     * поле - виробник
     */
    public String manufacturer;
    /**
     * поле - ціна
     */
    public int price;
    /**
     * поле - вага
     */
    public String weight;
    /**
     * поле - кількість
     */
    public int quantity;

    /**
     * конструктор
     * @param name           - назва
     * @param manufacturer   - виробник
     * @param price          - ціна
     * @param weight         - вага
     * @param quantity       - кількість
     */

    public Inventory(String name, String manufacturer, int price, String weight, int quantity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }

    /**
     * функція отримання значення поля {@link Inventory#price}
     * @return повертає ціну
     */
    public int getPrice() {
        return price;
    }

    /**
     * функція отримання значення поля {@link Inventory#quantity}
     * @return повертає кількість
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * головний метод програми створює масив з об'єктів та встановлює для них значення властивостей.
     * сортує об'єкти за ціною {@link Inventory#getPrice()} у порядку зростання та за кількістю {@link Inventory#getQuantity()} у порядку спадання за допомогою Comparator.
     * виводить на екран відсортований масив об'єктів.
     */

    public static void main(String[] args) {
        int zalicova = 9126;
        int x = zalicova % 11; //7

        System.out.println("С11 = " + x);
        System.out.println();

        Inventory[] inventory = {
                new Inventory("М'ячі", "Extreme Motion", 230, "270 г", 198),
                new Inventory("Гантелі", "MAYO", 279, "1,9 кг", 98 ),
                new Inventory("Каримати", "Energetics", 717, "500 г", 210),
                new Inventory("Обручі", "LiveUp", 327, "530 г", 315),
                new Inventory("Боксерські рукавички", "Green Hill", 1935, "12 унц", 36),
                new Inventory("Скакалки", "Nike", 408, "200 г", 512)};

        Comparator<Inventory> inventoryComparator
                = Comparator.comparing(Inventory::getPrice);
        Arrays.sort(inventory, inventoryComparator);

        System.out.println("Сортування за ціною у порядку зростання");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i].name + " - " + inventory[i].price + " - " + inventory[i].manufacturer);
        }
        System.out.println("");

        Comparator<Inventory> inventoryComparator1
                = Comparator.comparing(Inventory::getQuantity).reversed();
        Arrays.sort(inventory, inventoryComparator1);

        System.out.println("Сортування за кількістю у порядку спадання");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i].name + " - " + inventory[i].quantity + " - " + inventory[i].weight);
        }
    }
}

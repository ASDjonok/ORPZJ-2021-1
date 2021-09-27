import java.util.ArrayList;

/**
 * Клас слугує для екіпірування лицаря.
 *
 * @author Анастасія Гриценко
 * @version 1.0 26 Sep 2021
 */
public class Test {

    /**
     * Головний метод програми.
     * Створює 3 масиви з об'єктами класів {@link ArmourOut}, {@link ArmourUnder} та {@link Weapon}.
     * Створює об'єкт класу {@link Knight} та виводить значення його полів на екран.
     * Підраховує загальну суму амуніції.
     * Створює {@link ArrayList<Equipment>} та додає всі об'єкти класів з 3-ох масивів з амуніцією у нього.
     * Сортує амуніцію за вагою за допомогою об'єкту класу {@link WeightComparator} і виводить на екран відсортований список амуніції.
     * Використовуючи цикл for each та оператор if, виводить на екран об'єкти, що відповідають заданому діапазону цін.
     */
    public static void main(String[] args) {

        //Створюю масиви лицарського одягу та зброї
        ArmourOut[] armour_out = {new ArmourOut("шолом", "сталь", 150, 15,
                "коричневий"), new ArmourOut("кольчуга", "залізо", 200, 35,
                "срібний")};

        ArmourUnder[] armour_un = {new ArmourUnder("хауберк", "шкіра",
                40, 3, "бежевий")};

        Weapon[] weapon = {new Weapon("колбен", "дерево", 50, 9,
                "ударна зброя"), new Weapon("цеп", "метал+дерево", 60, 12,
                "ударна зброя")};

        Knight k1 = new Knight("Артур", 25, "Великобританія", armour_out, armour_un, weapon);
        System.out.print("Лицар має такі характеристики: " + k1 + "; оснащений такою амуніцією: ");

        int equipment_sum = 0;

        int flag = 0;
        for (ArmourOut arm : armour_out) {
            flag++;
            System.out.print(flag + ") " + arm.toString() + "; ");
            equipment_sum += arm.cost;
        }

        for (ArmourUnder arm_un : armour_un) {
            flag++;
            System.out.print(flag + ") " + arm_un.toString() + "; ");
            equipment_sum += arm_un.cost;
        }

        for (Weapon weap : weapon) {
            flag++;
            System.out.println(flag + ") " + weap.toString() + "; ");
            equipment_sum += weap.cost;
        }

        System.out.println("----------------------");

        System.out.println("Загальна сума всієї амуніції: " + equipment_sum);

        //Створюю ArrayList, який потрібен буде для сортування за вагою.
        ArrayList<Equipment> list1 = new ArrayList<>();

        for (ArmourOut each : armour_out) {
            list1.add(each);
        }

        for (ArmourUnder each : armour_un) {
            list1.add(each);
        }

        for (Weapon each : weapon) {
            list1.add(each);
        }

        System.out.println("----------------------");

        //Сортування амуніції за вагою.
        WeightComparator myWeightComparator = new WeightComparator();
        list1.sort(myWeightComparator);

        System.out.println("Сортування амуніції за вагою: ");
        for (Equipment equip : list1) {
            System.out.println(equip);
        }

        System.out.println("----------------------");

        //Знайти елементи амуніції, що відповідають заданому діапазону цін.
        System.out.println("Вивід на екран амуніції, ціна якої належить діапазону (40, 200): ");
        for (Equipment eq : list1) {
            if ((eq.cost > 40) && (eq.cost < 200)) {
                System.out.println(eq);
            }
        }
    }
}

import java.util.Comparator;

/**
 * Клас слугує для реалізації інтерфейсу Comparator.
 *
 * @author Анастасія Гриценко
 * @version 1.0 26 Sep 2021
 */
public class WeightComparator implements Comparator<Equipment> {

    /**
     * Функція реалізує метод compare in Comparator.
     *
     * @param eq1 перший об'єкт класу {@link Equipment}
     * @param eq2 другий об'єкт класу {@link Equipment}
     * @return повертає вагу амуніції
     */
    public int compare(Equipment eq1, Equipment eq2) {
        if (eq1.weight == eq2.weight) {
            return 0;
        }
        if (eq1.weight > eq2.weight) {
            return 1;
        } else {
            return -1;
        }
    }
}
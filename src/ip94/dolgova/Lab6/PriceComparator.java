package ip94.dolgova.Lab6;

import java.util.Comparator;

/**
 * Клас слугує для порівняння кави за повною ціною
 *
 * @author Долгова Єлизавета
 * @version 1.0 7 Oct 2021
 */
public class PriceComparator implements Comparator<Coffee> {

    /**
     * Функція реалізує метод compare in Comparator.
     *
     * @param arg0 перший об'єкт класу {@link Coffee}
     * @param arg1 другий об'єкт класу {@link Coffee}
     * @return повертає 1, -1 або 0 для подальшого сортування
     */
    @Override
    public int compare(Coffee arg0, Coffee arg1) {
	if (arg0.countTotalPrice() == arg1.countTotalPrice()) {
	    return 0;
	}
	if (arg0.countTotalPrice() > arg1.countTotalPrice()) {
	    return 1;
	} else {
	    return -1;
	}
    }
}
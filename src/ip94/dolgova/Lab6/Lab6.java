package ip94.dolgova.Lab6;

import java.util.*;

/**
 * Клас слугує для завантаження кави у фургон та її сортування.
 *
 * @author Долгова Єлизавета
 * @version 1.0 7 Oct 2021
 */
public class Lab6 {
    /**
     * Змінні для кодів кольорів ANSI
     */
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";

    /**
     * Головний метод програми. Створює масив з об'єктами класів {@link Arabica},
     * {@link Robusta}, {@link Stenofilla}, {@link Excelsa} та {@link Liberica}.
     * Створює об'єкт класу {@link Van} Завантажує фургон максимальною к-істю кави
     * Створює {@link ArrayList<Сoffee>} та додає весь вміст фургону у нього для
     * подальшого перекладання в фургон Сортує каву за повною ціною за допомогою
     * об'єкту класу {@link PriceComparator} і виводить на екран відсортований
     * список кави. Використовуючи цикл for each та оператор if, виводить на екран
     * об'єкти, що відповідають заданому діапазону якості кави.
     */
    public static void main(String[] args) {

	Coffee[] coffeeToSell = { new Arabica("jar", "ground", 3, 150, 8), new Robusta("pack", "grain", 5, 80, 6),
		new Liberica("jar", "grain", 2, 100, 6), new Excelsa("pack", "ground", 10, 120, 7),
		new Stenofilla("jar", "soluble", 16, 70, 3), new Arabica("pack", "grain", 11, 140, 9),
		new Liberica("jar", "grain", 9, 90, 5), new Stenofilla("jar", "soluble", 13, 60, 4),
		new Stenofilla("jar", "soluble", 7, 100, 6), };

	Van van = new Van(70);

	// Fill in the van
	System.out.println(ANSI_GREEN + "Filling in the van" + ANSI_RESET);

	// ArrayList to add elements to the van
	ArrayList<Coffee> myList = new ArrayList<Coffee>();

	int uploadedWeight = 0;
	for (Coffee item : coffeeToSell) {
	    if (uploadedWeight < van.getAvailableWeight()) {
		myList.add(item);
		uploadedWeight += item.getWeight();
	    } else {
		break;
	    }
	}
	// Adding to the van
	van.setContent(myList.toArray(coffeeToSell));

	System.out.println("The van is full with the weight: " + uploadedWeight);

	// Sort by totalPrice
	System.out.println(ANSI_GREEN + "Sorting by total price" + ANSI_RESET);
	PriceComparator myPriceComparator = new PriceComparator();
	Arrays.sort(coffeeToSell, myPriceComparator);

	// Printing the sorted array
	for (Coffee item : coffeeToSell) {
	    System.out.println(item.toString() + "; totalPrice: " + item.countTotalPrice());
	}

	System.out.println(ANSI_GREEN + "Printing out coffee with quality between 4 and 7" + ANSI_RESET);

	for (Coffee item : myList) {
	    if ((item.getQuality() >= 4) && (item.getQuality() <= 7)) {
		System.out.println(item);
	    }
	}
    }
}

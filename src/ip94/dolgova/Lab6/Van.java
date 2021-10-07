package ip94.dolgova.Lab6;

/**
 * Клас слугує для задання Фургону
 *
 * @author Долгова Єлизавета
 * @version 1.0 7 Oct 2021
 */
public class Van {
    /**
     * Поле - можлива вага погрузки
     */
    public int availableWeight;
    /**
     * Поле - вміст
     */
    public Coffee[] content;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param availableWeight можлива вага погрузки
     */
    public Van(int availableWeight) {
	this.availableWeight = availableWeight;
    }

    /**
     * Функція для виведення вмісту фургону
     */
    public void DisplayVan() {
	for (int i = 0; i < content.length; i++) {
	    System.out.println("Item " + i);
	    System.out.println(content[i].toString());
	}
    }
}

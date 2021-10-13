package ip94.dolgova.Lab6;

import java.util.Arrays;

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
    private int availableWeight;
    /**
     * Поле - вміст
     */
    private Coffee[] content;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param availableWeight можлива вага погрузки
     */
    public Van(int availableWeight) {
	this.setAvailableWeight(availableWeight);
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

    public int getAvailableWeight() {
	return availableWeight;
    }

    public void setAvailableWeight(int availableWeight) {
	this.availableWeight = availableWeight;
    }

    public Coffee[] getContent() {
	return content;
    }

    public void setContent(Coffee[] content) {
	this.content = content;
    }
}

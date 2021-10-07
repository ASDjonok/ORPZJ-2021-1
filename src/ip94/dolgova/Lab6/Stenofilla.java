package ip94.dolgova.Lab6;

/**
 * Клас слугує для знаслідування класу Coffee
 *
 * @author Долгова Єлизавета
 * @version 1.0 7 Oct 2021
 */
public class Stenofilla extends Coffee {
    /**
     * Поле - місце росту
     */
    private String placeOfGrowth = "Sierra Leone";
    /**
     * Поле - гіркота (від 1 до 5)
     */
    private int bitterness = 4;
    /**
     * Поле - вмість кофеїну (у мг)
     */
    private int caffeine = 40;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param packing    упаковка (банка, пакет)
     * @param state      стан (зерно, мелена, розчинна)
     * @param weight     вага (у кг)
     * @param pricePerKg ціна за кг
     * @param quality    якість (від 1 до 10)
     */
    public Stenofilla(String packing, String state, int weight, int pricePerKg, int quality) {
	super(packing, state, weight, pricePerKg, quality);
    }

    /**
     * Функція для виводу на екран значень полів об'єктів класу у вигляді рядка.
     */
    @Override
    public String toString() {
	final StringBuffer sb = new StringBuffer("");
	sb.append("Stenofilla. ");
	sb.append("Packing: ").append(packing);
	sb.append("; state: ").append(state);
	sb.append("; weight: ").append(weight);
	sb.append("; pricePerKg: ").append(pricePerKg);
	sb.append("; quality: ").append(quality);
	sb.append("; placeOfGrowth: ").append(placeOfGrowth);
	sb.append("; bitterness: ").append(bitterness);
	sb.append("; caffeine: ").append(caffeine);
	return sb.toString();
    }
}

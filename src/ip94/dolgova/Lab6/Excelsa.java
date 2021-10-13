package ip94.dolgova.Lab6;

/**
 * Клас слугує для знаслідування класу Coffee
 *
 * @author Долгова Єлизавета
 * @version 1.0 7 Oct 2021
 */
public class Excelsa extends Coffee {

    /**
     * Поле - місце росту
     */
    private String placeOfGrowth = "Central Africa, Asia";
    /**
     * Поле - гіркота (від 1 до 5)
     */
    private int bitterness = 3;
    /**
     * Поле - вмість кофеїну (у мг)
     */
    private int caffeine = 52;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param packing    упаковка (банка, пакет)
     * @param state      стан (зерно, мелена, розчинна)
     * @param weight     вага (у кг)
     * @param pricePerKg ціна за кг
     * @param quality    якість (від 1 до 10)
     */
    public Excelsa(String packing, String state, int weight, int pricePerKg, int quality) {
	super(packing, state, weight, pricePerKg, quality);
    }

    /**
     * Функція для виводу на екран значень полів об'єктів класу у вигляді рядка.
     */
    @Override
    public String toString() {
	final StringBuffer sb = new StringBuffer("");
	sb.append("Excelsa. ");
	sb.append("Packing: ").append(getPacking());
	sb.append("; state: ").append(getState());
	sb.append("; weight: ").append(getWeight());
	sb.append("; pricePerKg: ").append(getPrice());
	sb.append("; quality: ").append(getQuality());
	sb.append("; placeOfGrowth: ").append(placeOfGrowth);
	sb.append("; bitterness: ").append(bitterness);
	sb.append("; caffeine: ").append(caffeine);
	return sb.toString();
    }
}

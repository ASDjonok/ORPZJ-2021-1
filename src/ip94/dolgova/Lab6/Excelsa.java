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
    private static String Excelsa_PlaceOf_Growth = "Central Africa, Asia";
    /**
     * Поле - гіркота (від 1 до 5)
     */
    private static int Excelsa_Bitterness = 3;
    /**
     * Поле - вмість кофеїну (у мг)
     */
    private static int Excelsa_Caffeine = 52;

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
	setPlaceOfGrowth(Excelsa_PlaceOf_Growth);
	setBitterness(Excelsa_Bitterness);
	setCaffeine(Excelsa_Caffeine);
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
	sb.append("; placeOfGrowth: ").append(getPlaceOfGrowth());
	sb.append("; bitterness: ").append(getBitterness());
	sb.append("; caffeine: ").append(getCaffeine());
	return sb.toString();
    }
}

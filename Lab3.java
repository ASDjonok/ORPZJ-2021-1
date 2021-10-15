import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lab3 {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("Почему програа удаляет этот текстт?");
        System.out.println(text);

        StringTokenizer st = new StringTokenizer(text.toString(), " ");
        ArrayList<String> list
                = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        System.out.println("----------------------");

        StringBuffer sb = new StringBuffer();

        //Визначаю, яка довжина мого кожного слова тексту
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ": " + list.get(i).length());
        }

        String[] symbols = {".", ",", "/", "!", ")", "(", "*", "&", "?"};

        int len = 7;
        for (int i = 0; i < list.size(); i++) {
            if (!isConsonant(list.get(i)) || list.get(i).length() != len || hasSymbol(list.get(i), symbols)) {
                sb.append(list.get(i)).append(" ");
            }
        }
        System.out.println(sb);

    }

    public static boolean hasSymbol(String incomingText, String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (incomingText.contains(s[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isConsonant(String incomingText) {
        switch (Character.toLowerCase(incomingText.charAt(0))) {
            case 'б':
            case 'в':
            case 'г':
            case 'д':
            case 'ж':
            case 'з':
            case 'й':
            case 'к':
            case 'л':
            case 'м':
            case 'н':
            case 'п':
            case 'р':
            case 'с':
            case 'т':
            case 'ф':
            case 'х':
            case 'ц':
            case 'ч':
            case 'ш':
            case 'щ':
                return true;
            default:
                return false;

        }
    }
}

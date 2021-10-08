import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lab3 {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("Эта пРоГрАмА удаляет слова с согласными буквами на первом МЕСТЕ");
        System.out.println(text);

        StringTokenizer st = new StringTokenizer(text.toString(), " ");
        ArrayList<String> list
                = new ArrayList<String>();

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        System.out.println("----------------------");

        for (String li : list) {
            System.out.println(li);
        }

        System.out.println("----------------------");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < list.size(); i++) {
            if (!isConsonant(list.get(i))) {
                sb.append(list.get(i)).append(" ");
            }
        }
        System.out.println(sb);
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

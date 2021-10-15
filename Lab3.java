import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lab3 {
    public static void main(String[] args) {

        //StringBuffer text = new StringBuffer("Три осенних месяца совершенно не похожи друг на друга . Сентябрь – теплый и красивый , октябрь – прохладный и дождливый , а ноябрь – морозный и холодный . Но все они несут нам что-то новое . Мне нравится каждый из них по-своему . Именно осень дарит нам бабье лето и проливные грозы , первые морозы и последнюю теплоту .");
        StringBuffer text = new StringBuffer("Почему прогаа! не удаляет текстт?");
        System.out.println(text);

        StringTokenizer st = new StringTokenizer(text.toString(), " ");
        ArrayList<String> list
                = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        System.out.println("----------------------");

        for (String li : list) {
            System.out.println(li);
        }

//        for(int i = 0; i < list.size(); i++) {
//            if(list.get(i).contains("?") || list.get(i).contains(",") || list.get(i).contains(".") || list.get(i).contains(":") || list.get(i).contains(";")){
//                System.out.println(list.get(i));
//            }
//        }
//        System.out.println("----------------------");

        StringBuffer sb = new StringBuffer();

        //Визначаю, яка довжина мого кожного слова тексту
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ": " + list.get(i).length());
        }

        int len = 7;
        for (int i = 0; i < list.size(); i++) {
            if (!isConsonant(list.get(i)) || (list.get(i).length() != len || list.get(i).contains("[^0-9]"))) {
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

package lab3;


public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Як добре те, що смерті не боюсь я\n" +
                "Над простором густых островов.\n" +
                "Снова смотрят знакомые очи,\n" +
                "И мелькает былое без слов.");
        System.out.println(text);
        System.out.println(replace(text));
    }

    public static StringBuilder replace(StringBuilder str){
        char[] chars = str.toString().toLowerCase().toCharArray();
        char firstElement = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '\n' || chars[i] == '\t') {
                firstElement = chars[i];
                continue;
            }
            if (chars[i] == ' ') {
                firstElement = chars[i + 1];
                i++;
                continue;
            }
            if (firstElement == chars[i]) {
                str.deleteCharAt(i);
                System.arraycopy(chars, i + 1, chars, i, chars.length - i - 1);
            }
        }
        return str;
    }
}

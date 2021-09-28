package com.company;

public class Main {

    public static void main(String[] args) {
        //Вариант 9108
        //Операция О1 +
        //Операция О2 +
        //Константа 0
        //Тип индексов i и j short
        // (i + j) / (i + 0)
        final short a = 4;
        final short b = -10;
        final short n = 10;
        final short m = -2;
        final short C = 0; //константа
        float result = 0; //float по условию

        if (n < a || m < b) {
            System.out.println("Неправильные параметры сумы ");
        } else {
            boolean isCountable = true;

            for (short i = a; i <= n; i++) {
                if (i + C == 0) {
                    System.out.println("Ноль в знаменателе");
                    isCountable = false; //ставим метку что не возможно посчитать сумму
                    break; //если знаменатель равен 0 выходим из циклов
                }
                short znam = (short) (i + C);
                for (short j = b; j <= m; j++) {
                    result += (float) (i + j) / znam;
                }
            }

            if (isCountable == true) {
                System.out.println("Результат " + result);
            }
        }
    }
}

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
        final short b = 10;
        final short n = 10;
        final short m = -2;
        final short C = 0; //константа
        float result = 0; //float по условию

        if (n < a || m < b) {
            System.out.println("Неправильные параметры сумы ");
        } else {
            boolean isCountable = true;
            if ((a + C <= 0) && (b + C >= 0)) {
                System.out.println("Ноль в знаменателе");
            }else {
                for (short i = a; i <= n; i++) {
                    short znam = (short) (i + C);
                    for (short j = b; j <= m; j++) {
                        result += (float) (i + j) / znam;
                    }
                }
                System.out.println("Результат " + result);
            }

        }
    }
}

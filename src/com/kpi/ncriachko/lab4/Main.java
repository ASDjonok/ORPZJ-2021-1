package com.kpi.ncriachko.lab4;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Clothes[] stock = new Clothes[5];
        // object creation
        stock[0] = new Clothes("asd", "gyssi",322.22,"Winter","L");
        stock[1] = new Clothes("asd", "kekes",100,"Spring","S");
        stock[2] = new Clothes("asd", "magnus",388,"Autumn","XS");
        stock[3] = new Clothes("steel", "handmade", 456, "Winter", "L");
        stock[4] = new Clothes("leather", "no", 741, "Any", "XL");
        ascendingSort(stock);
        for (int i = 0; i < stock.length; i++) {
            System.out.println(stock[i].getPrice());
        }
        descendingOrder(stock);
        System.out.println();
        for (int i = 0; i < stock.length; i++) {
            System.out.println(stock[i].getPrice());
        }
    }

    private static Clothes[] ascendingSort(Clothes[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j].getPrice() > arr[j+1].getPrice()) {
                    Clothes temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }
    private static Clothes[] descendingOrder(Clothes[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j].getPrice() < arr[j+1].getPrice()) {
                    Clothes temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }


}

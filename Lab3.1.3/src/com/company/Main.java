package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //строчка с заданным типом StringBuilder
        StringBuilder str = new StringBuilder("Mr. Owl ate my metal worm. Do geese see God. Go hang a salami, I'm a lasagna hog");

        ArrayList<String> arr = new ArrayList<>();
        int n = str.length();

        for(int i = 0; i <= n; i++) {
            for(int j = i + 1; j <= n; j++) {
                String s = str.substring(i, j);
                //чистим строчку от лишних символов
                String st = s.replaceAll("\\W","");
                if (isPalindrome(st)) {
                    if(!arr.contains(s)){
                        arr.add(s);
                    }
                }
            }
        }

        SortedSet res = new TreeSet();
        int largestString = arr.get(0).length();
        int index = 0;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() > largestString) {
                largestString = arr.get(i).length();
                index = i;
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() == largestString) {
                res.add(arr.get(i));
            }
        }
        res.forEach(System.out::println);

    }

    public static boolean isPalindrome(String str) {
        String test = new StringBuilder(str).reverse().toString();
        if(test.equalsIgnoreCase(str)){
            return true;
        }else {
            return false;
        }
    }
}

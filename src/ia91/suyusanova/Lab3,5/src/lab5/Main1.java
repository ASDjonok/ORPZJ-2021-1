package lab5;


import lab5.entity.*;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Дождались меня белые ночи\n" +
                "Над простором густых островов.\n" +
                "Снова смотрят знакомые очи,\n" +
                "И мелькает былое без слов.");
        replace(text);
    }

    public static void replace(StringBuilder str) {
        Text text1 = new Text(str.toString());
        List<Sentence> sentences = text1.getSentences();
        for (Sentence sentence : sentences) {
            for (int k = 0; k < sentence.elements.size(); k++) {
                Element element = sentence.elements.get(k);
                if (element instanceof Word) {
                    Character letterToDelete = ((Word) element).letters.get(0).getLoverCase();
                    for (int j = 1; j < ((Word) element).letters.size(); j++) {
                        if (((Word) element).letters.get(j).getElement().compareTo(letterToDelete) == 0) {
                            ((Word) element).letters.remove(j);
                            j--;
                        }
                    }
                }
            }
        }
        System.out.println(text1);
    }



}

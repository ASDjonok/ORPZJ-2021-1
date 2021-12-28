package com.kpi.ncriachko.lab5;

public class Text {
    private Sentence[] textContainer;

    public Text(Sentence[] a) {
        textContainer = a;
    }
    public Sentence[] getContent() {
        return textContainer;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        for (Sentence sentence : textContainer) {
            resultString.append(sentence.toString());

        }
        return resultString.toString();
    }
}

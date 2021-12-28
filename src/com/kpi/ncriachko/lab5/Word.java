package com.kpi.ncriachko.lab5;

import java.util.Arrays;

public class Word {
    private Letter[] word;
    public Word (Letter[] a){
        word = a;
    }

    public Letter[] getWord() {
        return word;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter letter: word) {
            result.append(letter.toString());
        }
        return result.toString();
    }
}

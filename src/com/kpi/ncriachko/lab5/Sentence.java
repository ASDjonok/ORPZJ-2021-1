package com.kpi.ncriachko.lab5;

import java.util.Arrays;

public class Sentence {
    private Word[] words;
    private Punctuation[] punctSigns;
    public Sentence(Word[] words, Punctuation[] punctSigns) {
        this.words = words;
        this.punctSigns = punctSigns;
    }
    public Sentence(Punctuation[] punctuation,Word ...a) {
        words = a;
        punctSigns = punctuation;
    }
    public Punctuation[] getPunctSigns() {
        return punctSigns;
    }

    public Word[] getWords() {
        return words;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        int index = 0;
        for (Word word: words) {
            resultString.append(word.toString());
            if (index < punctSigns.length) {
                resultString.append(punctSigns[index].getPunctuationSymb());
                index++;
            }

        }
        return resultString.toString();
    }
}

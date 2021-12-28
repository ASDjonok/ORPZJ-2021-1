package com.kpi.ncriachko.lab5;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "koala, kola, kolan, monkey, monk, kola";
        Text test = new Text(new Sentence[]{new Sentence(
                new Punctuation[]{new Punctuation("&&&!!"),
                        new Punctuation(". "),
                        new Punctuation("??!! . !")},
                createNewWord("koala"),
                createNewWord("kola"),
                createNewWord("kolan"),
                createNewWord("monkey"),
                createNewWord("monk"),
                createNewWord("kola"))});
        System.out.println(replaceAllWordsOfSelectedLengthWith(test, 4, createNewWord("kekes")));
    }


    private static Word createNewWord(String input) {
        Letter[] letters = new Letter[input.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Letter(input.charAt(i));
        }
        return new Word(letters);
    }

    private static Text replaceAllWordsOfSelectedLengthWith(Text text, int wordLength, Word replaceWord) {
        Sentence[] sentences = text.getContent();
        for (int i = 0; i < sentences.length; i++) {
            Word[] words = sentences[i].getWords();
            for (int j = 0; j < words.length; j++) {
                if(words[j].getWord().length == wordLength) {
                    words[j] = replaceWord;
                }
            }

        }
        return new Text(sentences);
    }

}

package com.kpi.ncriachko.lab3;

public class Lab3 {
    public static void main(String[] args) {
        String text = "koala abcd. kola, kolan, monkey, monk, kola";

        System.out.println(replaceAllWordsOfSelectedLengthWith(text, 4,"bold"));
    }

    /**
     * Replaces all words of the selected length in the text
     *
     * @param text string in which we replace words
     * @param wordLength Length of the word to replace
     * @param replaceString A string that replaces the string with targeted length
     * @return Formatted string with replaced words
     */
    private static String replaceAllWordsOfSelectedLengthWith(String text, int wordLength, String replaceString) {
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                word += text.charAt(i);
            } else if (word.length() == wordLength) {
                text = replaceWord(text,i - wordLength, wordLength, replaceString);
                word = "";
            } else {
                word = "";
            }
        }
        if (word.length() == wordLength) {
            text = replaceWord(text, text.length() - wordLength, wordLength, replaceString);
        }
        return text;
    }

    /**
     * Replaces word in the string with the selected string
     *
     * @param text string in which we need to replace the word
     * @param beginningIndex Beginning index of the word that we need to replace
     * @param targetWordLength Length of the word that we need to replace
     * @param replacement A string that replaces the target string
     * @return String with replaced word.
     */
    private static String replaceWord(String text, int beginningIndex, int targetWordLength, String replacement) {
        return text.substring(0, beginningIndex).concat(replacement).concat(text.substring(beginningIndex + targetWordLength));
    }
}

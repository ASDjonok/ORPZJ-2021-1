package lab5.entity;

import lab5.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    public List<Element> elements = new ArrayList<>();

    @Override
    public String toString() {
        return elements.toString();
    }

    public Sentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] elements1 = words[i].toCharArray();
            Word word = new Word();
            Punctuation punctuation = new Punctuation();
            for (char element : elements1) {
                if (Utils.isLetter(element)) {
                    word.letters.add(new Letter(element));
                } else {
                    punctuation.getElements().add(element);
                }
            }
            elements.add(word);
            elements.add(punctuation);
        }
    }
}

package lab5.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
    List<Sentence> sentences = new ArrayList<>();

    public Text(String text) {
        String[] array = text.split("\\.");
        for (String s : array) {
            sentences.add(new Sentence(s + "."));
        }
    }

    @Override
    public String toString() {
        return sentences.toString();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }
}

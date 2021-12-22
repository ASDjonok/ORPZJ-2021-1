package lab5.entity;

import java.util.ArrayList;
import java.util.List;

public class Punctuation implements Element {
    List<Character> elements = new ArrayList<>();

    @Override
    public String toString() {
        return elements.toString();
    }

    public List<Character> getElements() {
        return elements;
    }

    public void setElements(List<Character> elements) {
        this.elements = elements;
    }
}

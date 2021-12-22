package lab5.entity;

import java.util.ArrayList;
import java.util.List;

public class Word implements Element {
    public List<Letter> letters = new ArrayList<>();

    @Override
    public String toString() {
        return letters.toString();
    }
}

package lab5.entity;

public class Letter {
    public Character element;

    public Character getElement() {
        return element;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    public Letter(Character element) {
        this.element = element;
    }

    public Character getLoverCase() {
        return Character.toLowerCase(element);
    }
}

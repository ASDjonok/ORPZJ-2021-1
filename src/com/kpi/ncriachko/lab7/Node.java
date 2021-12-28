package com.kpi.ncriachko.lab7;

import com.kpi.ncriachko.lab6.Plane;

public class Node<T extends Plane> {
    private T value;
    private Node<T> nextNode;
    private Node<T> previousNode;

    public Node(T value, Node<T> nextNode, Node<T> previousNode) {
        this.value = value;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }
}

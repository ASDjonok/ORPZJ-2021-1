package com.company;

import java.util.*;

/**
 * Клас слугує для задання шаблону для майбутніх LinkedList та оголошення методів.
 *
 * @author Анастасія Гриценко
 * @version 1.0 24 Nov 2021
 */

public class LinkedList<T> implements List<T> {
    /**
     * Поле - об'єкт приватного класу {@link Node}
     */
    private Node<T> head;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     */
    //Порожній конструктор
    public LinkedList() {
    }

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param eq об'єкт узагальненого класу
     */
    //Конструктор, в який буде передаватися об'єкт класу Equipment
    public LinkedList(T eq) {
        addFirst(eq);
    }


    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param eq стандартна колекція об'єктів
     */
    //В конструктор передається готова колекція з об'єктами
    public LinkedList(Collection<T> eq) {
        for (T t : eq) {
            addLast(t);
        }
    }

    //Методи, які реалізує LinkedList

    /**
     * Функція для додавання елементу в початок LinkedList.
     */
    public void addFirst(T eq) {
        Node<T> firstNode = new Node<>(eq);
        firstNode.next = head;
        head = firstNode;
    }

    /**
     * Функція для додавання елементу в кінець LinkedList.
     */
    public void addLast(T eq) {
        //Перевірка чи є список порожнім
        if (head == null) {
            head = new Node<>(eq);
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(eq);
    }


    /**
     * Функція для отримання індексу певного об'єкту класу {@link Equipment}.
     */
    public int get(T eq) {
        if (head == null) {
            return -1;
        }
        //Якщо head - шукане значення
        if (head.value == eq) {
            return 0;
        }
        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null) {
            ++result;
            if (currentNode.next.value == eq) {
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    /**
     * Функція для видалення елементу з LinkedList.
     */
    @Override
    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        //Якщо head - шукане значення
        if (head.value == o) {
            head = head.next;
            return true;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == o) {
                currentNode.next = currentNode.next.next;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    /**
     * Функція для пошуку індексу певного об'єкту класу {@link Equipment}.
     */
    @Override
    public int indexOf(Object obj) {
        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.value.equals(obj)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    /**
     * Функція для виводу на екран розміру LinkedList.
     */
    @Override
    public int size() {
        int count = 0;
        Node current = this.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                "}";
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    /**
     * Приватний клас, який слугує для визначення вузла в LinkedList.
     *
     * @author Анастасія Гриценко
     * @version 1.0 24 Nov 2021
     */

    private static class Node<Equipment> {
        /**
         * Поле - об'єкт класу {@link Equipment}
         */
        private final Equipment value;

        /**
         * Поле - об'єкт класу {@link Node}
         */
        //Посилання на наступний елемент
        private Node<Equipment> next;

        /**
         * Конструктор - створення нового об'єкту з певними значеннями
         *
         * @param value об'єкт класу {@link Equipment}
         */
        public Node(Equipment value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    "}";
        }
    }
}

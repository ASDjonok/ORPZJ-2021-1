package com.kpi.ncriachko.lab7;

import com.kpi.ncriachko.lab6.Plane;

import java.util.*;

public class CustomList<E extends Plane> implements List<Plane> {
    private Node first;
    private Node last;
    private int size;

    public CustomList(){
    }
    public CustomList(E plane) {
        add(plane);
    }
    public CustomList(Collection<E> planes) {
        addAll(planes);
    }

    private void linkFirst(Plane value) {
        Node firstNode = first;
        Node newNode = new Node(null,value,firstNode);
        first = newNode;
        if(firstNode == null) {
            last = newNode;
        } else {
            firstNode.previous = first;
        }
        size++;

    }

    private void linkLast(Plane value) {
        Node l = last;
        Node newNode = new Node(l, value, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private void linkBefore(Plane value, Node node) {
        Node prev = node.previous;
        Node newNode = new Node(prev,value,node);
        node.previous = newNode;
        if (prev == null) {
            first = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
    }

    private Plane unlinkFirst(Node f) {
        Plane value = f.value;
        Node next = f.next;
        f.next = null;
        f.value = null;
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.previous = null;
        }
        size--;
        return value;
    }

    private Plane unlinkLast(Node l) {
        Plane value = l.value;
        Node prev = l.previous;
        l.value = null;
        l.previous = null;
        last = prev;
        if (prev == null) {
            first = null;
        } else {
            l.next = null;
        }
        size--;
        return value;
    }

    private Plane unlinkNode(Node node) {
        Plane value = node.value;
        Node next = node.next;
        Node prev = node.previous;
        node.value = null;
        if (next == null) {
            last = prev;

        } else {
            next.previous = prev;
            node.next = null;
        }

        if(prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.previous = null;
        }
        return value;
    }

    private Node getNode(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public CustomIterator iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<Plane> {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Plane next() {
            try {
                Plane curValue  = current.value;
                current = current.next;
                return curValue;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();
            }
        }
    }
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int index = 0;
        for (Node i = first; i != null; i = i.next) {
            result[index++] = i.value;
        }
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Plane plane) {
        linkLast(plane);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (Node i = first; i != null; i = i.next) {
                if (i.value == null) {
                    unlinkNode(i);
                    return true;
                }
            }
        } else {
            for (Node i = first; i != null; i = i.next) {
                if(o.equals(i.value)) {
                    unlinkNode(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Plane> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Plane> c) {
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
        for (Node i = first; i != null;) {
            Node next = i.next;
            i.next = null;
            i.previous = null;
            i.value = null;
            i = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public Plane get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return getNode(index).value;
    }

    @Override
    public Plane set(int index, Plane element) {
        Node node = getNode(index);
        Plane rmVal = node.value;
        node.value = element;
        return rmVal;
    }

    @Override
    public void add(int index, Plane element) {
        linkBefore(element, getNode(index));
    }

    @Override
    public Plane remove(int index) {
        return unlinkNode(getNode(index));
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node i = first; i != null; i = i.next) {
                if (i.value == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node i = first; i != null; i = i.next) {
                if (o.equals(i.value)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size-1;
        if (o == null) {
            for (Node i = last; i != null; i = i.previous) {
                if (i.value == null) {
                    return index;
                }
                index--;

            }
        } else {
            for (Node i = last; i != null; i = i.previous) {
                if (o.equals(i.value)) {
                    return index;
                }
                index--;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<Plane> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Plane> listIterator(int index) {
        return null;
    }

    @Override
    public List<Plane> subList(int fromIndex, int toIndex) {
        return null;
    }
    private static class Node {
        Plane value;
        Node next;
        Node previous;
        Node(Node previous, Plane value, Node next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }



    }
}

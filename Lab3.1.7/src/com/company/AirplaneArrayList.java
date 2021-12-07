package com.company;

import java.util.*;
import java.util.List;

public class AirplaneArrayList implements List {

    private int capacity = 15;
    private Object[] airArray;
    private int fullness = 0;
    private final double percentReserve = 30.0;

    public AirplaneArrayList() {
        airArray = new Airplane[capacity];
    }

    public AirplaneArrayList(Airplane plane) {
        airArray = new Airplane[capacity + 1];
        airArray[0] = plane;
    }

    public AirplaneArrayList(ArrayList<Airplane> planes) {
        airArray = new Airplane[capacity + planes.size()];

    }

    @Override
    public int size() {
        return airArray.length;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        for(Object el : airArray){
            if(el != null){
                empty = false;
            }
        }
        return empty;
    }

    @Override
    public boolean contains(Object o) {
        boolean contain = false;
        for(Object el : airArray){
            if(el.equals(o)){
                contain = true;
            }
        }
        return contain;
    }

    @Override
    public Iterator iterator() {
        return new AirArrayIterator(airArray);
    }

    @Override
    public Object[] toArray() {
        Object[] arr = airArray;
        return arr;
    }

    @Override
    public boolean add(Object o) {
        if (fullness < capacity){
            airArray[fullness] = (Airplane) o;
        } else {         //если массив полностью занят
            Object[] newAirArray = airArray; // копируем старый массив
            int newCapacity = (int) (capacity * (1.0 + percentReserve)); //новый размер
            airArray = new Airplane[newCapacity]; // наш массив с новым размером
            System.arraycopy(newAirArray, 0, airArray, 0, capacity); //заполняем уыеличеный массив
            capacity = newCapacity;
            airArray[fullness] = (Airplane) o;//добавляем обьект
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Object[] newArr = airArray;
        int ind = 0;
        for (Object el : airArray){
            if (!el.equals(o)){
                newArr[ind] = el;
                ind++;
            }
        }
        fullness = ind + 1;
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        if (fullness < capacity){
            airArray[fullness] = c;
        } else {         //если массив полностью занят
            Object[] newAirArray = airArray; // копируем старый массив
            int newCapacity = (int) (capacity * (1.0 + percentReserve)); //новый размер
            airArray = new Airplane[newCapacity]; // наш массив с новым размером
            System.arraycopy(newAirArray, 0, airArray, 0, capacity); //заполняем уыеличеный массив
            capacity = newCapacity;
            airArray[fullness] = c;//добавляем колекцию
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if((index < capacity) & (index >= 0)){
            airArray[index] = c;
        }
        return false;
    }

    @Override
    public void clear() {
        airArray = new Object[0];
        fullness = 0;
    }

    @Override
    public Object get(int index) {
        return airArray[index];
    }

    @Override
    public Object set(int index, Object element) {
        if((index < capacity) & (index >= 0)){
            Object prev = airArray[index];
            airArray[index] = (Airplane) element;
            return prev;
        }else {
            return null;
        }
    }

    @Override
    public void add(int index, Object element) {
        if((index < capacity) & (index >= 0)){
            airArray[index] = (Airplane) element;
        }
    }

    @Override
    public Object remove(int index) {
        if((index < capacity) & (index >= 0)){
            airArray[index] = null;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int ind = 0;
        for(Object el : airArray){
            if (el.equals(o)){
               break;
            }
            ind++;
        }
        return ind;
    }

    @Override
    public int lastIndexOf(Object o) {
        int ind = 0;
        int res = 0;
        for(Object el : airArray){
            if (el.equals(o)){
                res = ind;
            }
            ind++;
        }
        return res;
    }

    @Override
    public ListIterator listIterator() {
        return  null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        Object[] newArray = new Airplane[toIndex - fromIndex];
        int ind = 0;
        for(int i = fromIndex; i < toIndex; i++){
            newArray[ind] = airArray[i];
            ind++;
        }
        List li= Arrays.asList(newArray);
        return li;
    }

    @Override
    public boolean retainAll(Collection c) {
        Object[] newArr = new Object[0];
        Set newC = (Set) c;
        int ind = 0;
        for(Object ob : airArray){
            for(Object el : newC){
                if(ob.equals(el)){
                    newArr[ind] = el;
                    ind++;
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        c.forEach(this::remove);
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean cont = true;
        for(Object el : c){
            if(!contains(el)){
                cont = false;
            }
        }
        return cont;
    }

    @Override
    public Object[] toArray(Object[] a) {
        a = airArray;
        return a;
    }
}

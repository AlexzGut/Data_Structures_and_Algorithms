package com.alexzgut.dsa.DataStructures.Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
* @author Alexander Gutierrez
* This class encapsulates an array and its operations
* It demonstrates the essential array operations.
* */
public class ArrayX<E>{

    Object[] array;
    int size;
    int capacity;

    public ArrayX(int capacity) {
        array = new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public void insert(E item) {
        if (size == capacity) {
            increaseCapacity();
        }
        array[size++] = item;
    }

    public void insert(int index, E item) {
        if (size == capacity) {
            increaseCapacity();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
    }

    private void increaseCapacity() {
        Object[] temp = new Object[capacity*2];
        for (int i = 0; i < size(); i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean delete(E item) {
        int k = 0;
        int i = 0;
        for (; i < size; i++) {
            if (!array[i].equals(item))
                array[k++] = array[i];
        }
        size = k;
        return (i != k);
    }

    @SuppressWarnings("unchecked")
    public E delete(int index) {
        if (index >= size() || index < 0) throw new IndexOutOfBoundsException();
        Object deletedItem = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return (E) deletedItem;
    }

    public boolean contains(E item) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(item)) return true;
        }
        return false;
    }

    public int indexOf(E item) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(item)) return i;
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) array[index];
    }

    public int size() {
        return size;
    }
}

package com.alexzgut.dsa.DataStructures.Array;

import java.util.Arrays;

/**
* @author Alexander Gutierrez
* This class encapsulates an array and its operations
* It demonstrates the essential array operations.
* */
public class ArrayX {

    long[] array;
    int size;
    int capacity;

    public ArrayX(int capacity) {
        array = new long[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public void insert(long item) {
        if (size == capacity) {
            increaseCapacity();
        }
        array[size++] = item;
    }

    public void insert(int index, long item) {
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
        long[] temp = new long[capacity*2];
        for (int i = 0; i < size(); i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean delete(long item) {
        int k = 0;
        int i = 0;
        for (; i < size; i++) {
            if (array[i] != item)
                array[k++] = array[i];
        }
        size = k;
        return (i != k);
    }

    public long delete(int index) {
        if (index >= size() || index < 0) throw new IndexOutOfBoundsException();
        long deletedItem = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deletedItem;
    }

    public boolean contains(long item) {
        for (int i = 0; i < size(); i++) {
            if (array[i] == item) return true;
        }
        return false;
    }

    public int indexOf(long item) {
        for (int i = 0; i < size(); i++) {
            if (array[i] == item) return i;
        }
        return -1;
    }

    public long get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }
}

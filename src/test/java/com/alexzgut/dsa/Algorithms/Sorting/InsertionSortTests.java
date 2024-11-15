package com.alexzgut.dsa.Algorithms.Sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTests {

    @Test
    void unsortedArrayTest() {
        int[] array = {3, 5, 2, 8, 7, 1, 0};
        int[] sortedArray = {0, 1, 2, 3, 5, 7, 8};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void unsortedArrayWithRepeatedNumbersTest() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = {1, 2, 5, 5, 6, 9};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void sortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = {1, 2, 3, 4, 5};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void reveresSortedArray() {
        int[] array = {8, 7, 5, 3, 2, 1, 0};
        int[] sortedArray = {0, 1, 2, 3, 5, 7, 8};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void arrayWithAllItemsTheSame() {
        int[] array = {9, 9, 9, 9, 9, 9, 9, 9};
        int[] sortedArray = {9, 9, 9, 9, 9, 9, 9, 9};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void arrayWithNegativeNumbers() {
        int[] array = {3, -1, 0, -4, 5, 2, -10};
        int[] sortedArray = {-10, -4, -1, 0, 2, 3, 5};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void arrayWithNoElements() {
        int[] array = {};
        int[] sortedArray = {};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void arrayWithOneElement() {
        int[] array = {10};
        int[] sortedArray = {10};
        InsertionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void arrayWithExtensiveNumberOfItems() {
        final int SIZE_DECLARATOR = 100000;
        int[] array = new int[SIZE_DECLARATOR];
        int[] sortedArray = new int[SIZE_DECLARATOR];

        Random rndNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rndNumber.nextInt(1000);
        }

        System.arraycopy(array, 0, sortedArray, 0, array.length);
        Arrays.sort(sortedArray);

        InsertionSort.sort(array);

        assertArrayEquals(array, sortedArray);
    }
}

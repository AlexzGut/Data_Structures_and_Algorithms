package com.alexzgut.dsa.Sorting;

import com.alexzgut.dsa.Algorithms.Sorting.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    void sortTest() {
        int[] array = {3, 5, 2, 8, 7, 1, 0};
        int[] sortedArray = {0, 1, 2, 3, 5, 7, 8};
        SelectionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void inverseArrayTest() {
        int[] array = {8, 7, 5, 3, 2, 1, 0};
        int[] sortedArray = {0, 1, 2, 3, 5, 7, 8};
        SelectionSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }
}

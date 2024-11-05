package com.alexzgut.dsa.Sorting;

import com.alexzgut.dsa.Algorithms.Sorting.BubbleSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void sortTest() {
        int[] array = {3, 5, 2, 8, 7, 1, 0};
        int[] sortedArray = {0, 1, 2, 3, 5, 7, 8};
        BubbleSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }
}

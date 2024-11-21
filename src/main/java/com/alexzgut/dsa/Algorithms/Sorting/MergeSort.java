package com.alexzgut.dsa.Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    /**
     * The merge sort algorithm uses recursion to divide the array passed as an argument in two halves
     * */
    public static void sort(int[] array) {

        // the condition is less than or equal to one, in case an array with no elements is passed as an argument.
        if (array.length <= 1) return; // base case of merge sort algorithm

        int middle = array.length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        int i = 0, j = 0, k = 0;
        while (k < array.length) {
            if (k < middle)
                leftArray[i++] = array[k++];
            else
                rightArray[j++] = array[k++];
        }

        sort(leftArray);    //recursive call to Merge Sort
        sort(rightArray);   //recursive call to Merge Sort
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        //Merge remaining items in array 'a'
        while (i < a.length) {
            c[k++] = a[i++];
        }

        //Merge remaining items in array 'b'
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

}

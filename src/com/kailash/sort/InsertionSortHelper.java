package com.kailash.sort;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSortHelper {
    private static InsertionSortHelper insertionSortHelper = null;

    public static InsertionSortHelper getInstance() {
        if (insertionSortHelper == null)
            insertionSortHelper = new InsertionSortHelper();
        return insertionSortHelper;
    }

    private void insertionSort( Integer[] data ){
        int temp, j;
        for ( int i = 1; i < data.length; i++ )
        {
            temp = data[i];
            for ( j = i - 1; j >= 0 && data[j] > temp; j-- )
            {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }
    }

    public void initiateInsertionSort( Integer[] inputSize1, Integer[] inputSize2, Integer[] inputSize3,
                                       Integer[] inputSize4, Integer[] inputSize5, Integer[] inputSize6, Integer[] inputSize7,
                                       Integer[] inputSize8, Integer[] inputSize9, Integer[] inputSize10, Integer[] inputSize11 ){

        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Insertion sort non-sorted array: ");

        long start = System.currentTimeMillis();
        insertionSort(inputSize1);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize2);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize3);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize4);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize5);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize6);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize7);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize8);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize9);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize10);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize11);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        // Array already Sorted
        System.out.print("Insertion sort sorted array: ");
        start = System.currentTimeMillis();
        insertionSort(inputSize1);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize2);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize3);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize4);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize5);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize6);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize7);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize8);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize9);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize10);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        insertionSort(inputSize11);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        // Array reverse sorted
        System.out.print("Insertion sort reverse sorted array: ");
        Arrays.sort(inputSize1, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize1);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize2, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize2);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize3, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize3);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize4, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize4);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize5, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize5);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize6, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize6);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize7, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize7);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize8, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize8);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize9, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize9);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize10, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize10);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize11, Collections.reverseOrder());
        start = System.currentTimeMillis();
        insertionSort(inputSize11);
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}

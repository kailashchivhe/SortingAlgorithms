package com.kailash.sort;

import java.util.Arrays;
import java.util.Collections;

public class QuickSortHelper {

    private static QuickSortHelper quickSortHelper = null;

    public static QuickSortHelper getInstance() {
        if (quickSortHelper == null)
            quickSortHelper = new QuickSortHelper();
        return quickSortHelper;
    }

    private void quickSort(Integer[] data, int left, int right) {
        while (left < right) {
            int index = partition(data, left, right);
            if (index - left < right - index) {
                quickSort(data, left, index - 1);
                left = index + 1;
            } else {
                quickSort(data, index + 1, right);
                right = index - 1;
            }
        }
    }

    private int partition(Integer[] data, int low, int high) {
        int pivot = data[high];
        int j = low;
        int i = low - 1;
        while (j <= high - 1) {
            if (data[j] < pivot) {
                i++;
                swap(data, i, j);
            }
            j++;
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    private void swap(Integer[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void initiateQuickSort( Integer[] inputSize1, Integer[] inputSize2, Integer[] inputSize3,
                                   Integer[] inputSize4, Integer[] inputSize5, Integer[] inputSize6, Integer[] inputSize7,
                                   Integer[] inputSize8, Integer[] inputSize9, Integer[] inputSize10, Integer[] inputSize11 ){

        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Quick sort non-sorted array: ");

        long start = System.currentTimeMillis();
        quickSort(inputSize1, 0, inputSize1.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize2, 0, inputSize2.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize3, 0, inputSize3.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize4, 0, inputSize4.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize5, 0, inputSize5.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize6, 0, inputSize6.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize7, 0, inputSize7.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize8, 0, inputSize8.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize9, 0, inputSize9.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize10, 0, inputSize10.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize11, 0, inputSize11.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        // Array already Sorted
        System.out.print("Quick sort sorted array: ");
        start = System.currentTimeMillis();
        quickSort(inputSize1, 0, inputSize1.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize2, 0, inputSize2.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize3, 0, inputSize3.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize4, 0, inputSize4.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize5, 0, inputSize5.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize6, 0, inputSize6.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize7, 0, inputSize7.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize8, 0, inputSize8.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize9, 0, inputSize9.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize10, 0, inputSize10.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        quickSort(inputSize11, 0, inputSize11.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        // Array reverse sorted
        System.out.print("Quick sort reverse sorted array: ");
        Arrays.sort(inputSize1, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize1, 0, inputSize1.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize2, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize2, 0, inputSize2.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize3, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize3, 0, inputSize3.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize4, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize4, 0, inputSize4.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize5, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize5, 0, inputSize5.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize6, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize6, 0, inputSize6.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize7, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize7, 0, inputSize7.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize8, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize8, 0, inputSize8.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize9, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize9, 0, inputSize9.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize10, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize10, 0, inputSize10.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize11, Collections.reverseOrder());
        start = System.currentTimeMillis();
        quickSort(inputSize11, 0, inputSize11.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}

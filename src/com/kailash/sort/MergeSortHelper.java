package com.kailash.sort;

import java.util.Arrays;
import java.util.Collections;

public class MergeSortHelper {
    private static MergeSortHelper mergeSortHelper = null;

    public static MergeSortHelper getInstance() {
        if (mergeSortHelper == null)
            mergeSortHelper = new MergeSortHelper();
        return mergeSortHelper;
    }

    private void mergeSort (Integer[] data, int lb, int ub)
    {
        int mid;
        if (lb < ub)
        {
            mid = (lb + ub) / 2;
            mergeSort ( data, lb, mid );
            mergeSort ( data, mid + 1, ub );
            merge ( data, lb, mid, ub );
        }
    }

    private void merge (Integer[] data, int lb1, int ub1, int ub2)
    {
        Integer[] temp = new Integer[data.length];
        int i, j, k;
        i = lb1;
        j = ub1 + 1;
        k = 0;

        while (i <= ub1 && j <= ub2)
        {
            if (data[i] < data[j])
            {
                temp[k++] = data[i++];
            }
            else
            {
                temp[k++] = data[j++];
            }
        }

        while (i <= ub1)
        {
            temp[k++] = data[i++];
        }
        while (j <= ub2)
        {
            temp[k++] = data[j++];
        }

        for (i = lb1, j = 0; i <= ub2; i++, j++)
        {
            data[i] = temp[j];
        }
    }
    
    public void initiateMergeSort( Integer[] inputSize1, Integer[] inputSize2, Integer[] inputSize3,
                                       Integer[] inputSize4, Integer[] inputSize5, Integer[] inputSize6, Integer[] inputSize7,
                                       Integer[] inputSize8, Integer[] inputSize9, Integer[] inputSize10, Integer[] inputSize11 ){

        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Merge sort non-sorted array: ");

        long start = System.currentTimeMillis();
        mergeSort(inputSize1, 0, inputSize1.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize2, 0, inputSize2.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize3, 0, inputSize3.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize4, 0, inputSize4.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize5, 0, inputSize5.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize6, 0, inputSize6.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize7, 0, inputSize7.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize8, 0, inputSize8.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize9, 0, inputSize9.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize10, 0, inputSize10.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize11, 0, inputSize11.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        // Array already Sorted
        System.out.print("Merge sort sorted array: ");
        start = System.currentTimeMillis();
        mergeSort(inputSize1, 0, inputSize1.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize2, 0, inputSize2.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize3, 0, inputSize3.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize4, 0, inputSize4.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize5, 0, inputSize5.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize6, 0, inputSize6.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize7, 0, inputSize7.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize8, 0, inputSize8.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize9, 0, inputSize9.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize10, 0, inputSize10.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        mergeSort(inputSize11, 0, inputSize11.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        // Array reverse sorted
        System.out.print("Merge sort reverse sorted array: ");
        Arrays.sort(inputSize1, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize1, 0, inputSize1.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize2, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize2, 0, inputSize2.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize3, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize3, 0, inputSize3.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize4, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize4, 0, inputSize4.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize5, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize5, 0, inputSize5.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize6, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize6, 0, inputSize6.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize7, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize7, 0, inputSize7.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize8, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize8, 0, inputSize8.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize9, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize9, 0, inputSize9.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize10, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize10, 0, inputSize10.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize11, Collections.reverseOrder());
        start = System.currentTimeMillis();
        mergeSort(inputSize11, 0, inputSize11.length - 1 );
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}

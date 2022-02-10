package com.kailash.sort;

import java.util.Arrays;
import java.util.Collections;

public class AdvancedQuickSortHelper {
    private static AdvancedQuickSortHelper advancedQuickSortHelper = null;

    public static AdvancedQuickSortHelper getInstance() {
        if (advancedQuickSortHelper == null)
            advancedQuickSortHelper = new AdvancedQuickSortHelper();
        return advancedQuickSortHelper;
    }

    //Modified Quick Sort
    private void quickSort(Integer[] data, int low, int high )
    {
        if(low + 8 <= high)
        {
            int pivot = getMedian( low, high,data );
            int middle = getMiddle( low, high, pivot, data );
            quickSort( data, low, middle-1 );
            quickSort( data, middle+1, high );
        }
        else
        {
            //If size <= 8 perform insertion sort
            InsertionSortHelper.getInstance().performInsertionSort( data );
        }
    }

    private int getMiddle( int low, int high, int pivot,Integer[] data)
    {
        int i = low, j = high - 1;
        while(true)
        {
            while( data[++i] < pivot );
            while( pivot < data[--j] );
            if( i >= j )
                break;
            else
                swap(i, j,data );
        }
        swap(i, high-1,data);
        return i;
    }

    //To find pivot using median method
    private int getMedian( int low, int high,Integer[] data )
    {
        int center = (low+high)/2;
        if(data[center] < data[low])
            swap( center, low,data);
        if(data[high] < data[low])
            swap( high, low,data);
        if(data[high] < data[center])
            swap(high, center,data );
        swap( center, high-1,data);
        return data[high-1];
    }

    private void swap(int i, int j,Integer[] data)
    {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void initiateAdvancedQuickSort( Integer[] inputSize1, Integer[] inputSize2, Integer[] inputSize3,
                                   Integer[] inputSize4, Integer[] inputSize5, Integer[] inputSize6, Integer[] inputSize7,
                                   Integer[] inputSize8, Integer[] inputSize9, Integer[] inputSize10, Integer[] inputSize11 ){

        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Modified Quick sort non-sorted array: ");

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
        System.out.print("Modified Quick sort sorted array: ");
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
        System.out.print("Modified Quick sort reverse sorted array: ");
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

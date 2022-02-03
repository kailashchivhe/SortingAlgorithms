package com.kailash.helper;

import com.kailash.sort.*;

import java.util.concurrent.ThreadLocalRandom;

public class SortHelper {

    private static void initRandomNumbers(Integer[] inputSize1, Integer[] inputSize2, Integer[] inputSize3,
                                         Integer[] inputSize4, Integer[] inputSize5, Integer[] inputSize6, Integer[] inputSize7,
                                         Integer[] inputSize8, Integer[] inputSize9, Integer[] inputSize10, Integer[] inputSize11 ) {
        for (int i = 0; i < inputSize1.length; i++) {
            generateRandomNumbers(inputSize1, i);
        }

        for (int i = 0; i < inputSize2.length; i++) {
            generateRandomNumbers(inputSize2, i);
        }

        for (int i = 0; i < inputSize3.length; i++) {
            generateRandomNumbers(inputSize3, i);
        }

        for (int i = 0; i < inputSize4.length; i++) {
            generateRandomNumbers(inputSize4, i);
        }

        for (int i = 0; i < inputSize5.length; i++) {
            generateRandomNumbers(inputSize5, i);
        }

        for (int i = 0; i < inputSize6.length; i++) {
            generateRandomNumbers(inputSize6, i);
        }

        for (int i = 0; i < inputSize7.length; i++) {
            generateRandomNumbers(inputSize7, i);
        }

        for (int i = 0; i < inputSize8.length; i++) {
            generateRandomNumbers(inputSize8, i);
        }

        for (int i = 0; i < inputSize9.length; i++) {
            generateRandomNumbers(inputSize9, i);
        }

        for (int i = 0; i < inputSize10.length; i++) {
            generateRandomNumbers(inputSize10, i);
        }

        for (int i = 0; i < inputSize11.length; i++) {
            generateRandomNumbers(inputSize11, i);
        }
    }

    private static void generateRandomNumbers( Integer[] inputSize, int index ) {
        inputSize[index] = ThreadLocalRandom.current().nextInt(1, inputSize.length + 1);
    }

    public static void initiateSorting(){
        Integer[] inputSize1 = new Integer[1000];
        Integer[] inputSize2 = new Integer[2000];
        Integer[] inputSize3 = new Integer[4000];
        Integer[] inputSize4 = new Integer[5000];
        Integer[] inputSize5 = new Integer[10000];
        Integer[] inputSize6 = new Integer[20000];
        Integer[] inputSize7 = new Integer[40000];
        Integer[] inputSize8 = new Integer[50000];
        Integer[] inputSize9 = new Integer[60000];
        Integer[] inputSize10 = new Integer[80000];
        Integer[] inputSize11 = new Integer[100000];

        initRandomNumbers(inputSize1, inputSize2, inputSize3, inputSize4, inputSize5, inputSize6, inputSize7,
                inputSize8, inputSize9, inputSize10, inputSize11 );

        InsertionSortHelper.getInstance().initiateInsertionSort( inputSize1, inputSize2, inputSize3, inputSize4, inputSize5, inputSize6, inputSize7,
                inputSize8, inputSize9, inputSize10, inputSize11 );

        MergeSortHelper.getInstance().initiateMergeSort( inputSize1, inputSize2, inputSize3, inputSize4, inputSize5, inputSize6, inputSize7,
                inputSize8, inputSize9, inputSize10, inputSize11 );

        QuickSortHelper.getInstance().initiateQuickSort( inputSize1, inputSize2, inputSize3, inputSize4, inputSize5, inputSize6, inputSize7,
                inputSize8, inputSize9, inputSize10, inputSize11 );

        AdvancedQuickSortHelper.getInstance().initiateAdvancedQuickSort( inputSize1, inputSize2, inputSize3, inputSize4, inputSize5, inputSize6, inputSize7,
                inputSize8, inputSize9, inputSize10, inputSize11 );

        HeapSortHelper.getInstance().initiateHeapSort( inputSize1, inputSize2, inputSize3, inputSize4, inputSize5, inputSize6, inputSize7,
                inputSize8, inputSize9, inputSize10, inputSize11 );
    }
}

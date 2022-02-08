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

    private void quickSort(Integer[] data, int low, int high) {
        if (low < high) {
            int n = high - low + 1;
            int med = findMedianOfMedian(data, low, high, n / 2);
            int pos = partition(data, low, high, med);
            quickSort(data, low, pos - 1);
            quickSort(data, pos + 1, high);
        }
    }

    private int findMedianOfMedian(Integer[] data, int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            int n = r - l + 1;
            int i;
            Integer[] median = new Integer[(n + 14) / 15];
            for (i = 0; i < (n / 15); i++) {
                median[i] = median(data, l + i * 15, 15);
            }
            if (i * 15 < n) {
                median[i] = median(data, l + i * 15, n % 15);
                i++;
            }
            int medOfMed = i == 1 ? median[i - 1] : findMedianOfMedian(median, 0, i - 1, i / 2);
            int pos = partition(data, l, r, medOfMed);
            if (pos - l == k - 1) {
                return data[pos];
            } else if (pos - l > k - 1) {
                return findMedianOfMedian(data, l, pos - 1, k);
            } else {
                return findMedianOfMedian(data, pos + 1, r, k - pos + l - 1);
            }
        }
        return Integer.MAX_VALUE;
    }

    private int median(Integer[] data, int i, int n) {
        int s = i;
        int e = i + n;
        while (i < e) {
            int element = data[i];
            int j = i - 1;
            boolean largeElementFound = false;
            while (j >= s && data[j] > element) {
                if (!largeElementFound) {
                    largeElementFound = true;
                }
                data[j + 1] = data[j];
                j--;
            }
            if (largeElementFound) {
                data[j + 1] = element;
            }
            i++;
        }
        return data[s + (n / 2)];
    }

    private int partition(Integer[] data, int left, int right, int pivot) {
        int i;
        for (i = left; i < right; i++) {
            if (data[i] == pivot) {
                break;
            }
        }
        swap(data, i, right);
        i = left;
        for (int j = left; j < right; j++) {
            if (data[j] <= pivot) {
                swap(data, i, j);
                i++;
            }
        }
        swap(data, i, right);
        return i;
    }

    private void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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

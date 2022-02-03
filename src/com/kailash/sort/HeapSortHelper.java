package com.kailash.sort;

import com.kailash.model.MinimumHeapTree;

import java.util.Arrays;
import java.util.Collections;

public class HeapSortHelper {
    private static HeapSortHelper heapSortHelper = null;

    public static HeapSortHelper getInstance() {
        if (heapSortHelper == null)
            heapSortHelper = new HeapSortHelper();
        return heapSortHelper;
    }

    // Heap if y method to maintain binary tree as binary heap
    private void heap(MinimumHeapTree minimumHeapTree, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int min = index;
        if (left < minimumHeapTree.getSize() && minimumHeapTree.getVector().get(min) > minimumHeapTree.getVector().get(left)) {
            min = left;
        }
        if (right < minimumHeapTree.getSize() && minimumHeapTree.getVector().get(min) > minimumHeapTree.getVector().get(right)) {
            min = right;
        }
        if (min != index) {
            int temp = minimumHeapTree.getVector().get(index);
            minimumHeapTree.getVector().set(index, minimumHeapTree.getVector().get(min));
            minimumHeapTree.getVector().set(min, temp);
            heap(minimumHeapTree, min);
        }
    }

    // Insert Key in Min heap
    private void insertKey(MinimumHeapTree minimumHeapTree, int key) {
        if (minimumHeapTree.getSize() >= minimumHeapTree.getCapacity()) {
            System.out.println("Heap Size Overflow");
        }
        minimumHeapTree.setSize( minimumHeapTree.getSize() + 1);
        int i = minimumHeapTree.getSize() - 1;
        minimumHeapTree.getVector().add(i, key);
        while (i != 0 && minimumHeapTree.getVector().get((i - 1) / 2) > minimumHeapTree.getVector().get(i)) {
            int temp = minimumHeapTree.getVector().get((i - 1) / 2);
            minimumHeapTree.getVector().set((i - 1) / 2, minimumHeapTree.getVector().get(i));
            minimumHeapTree.getVector().set(i, temp);
            i = (i - 1) / 2;
        }
    }

    // Extract Min in Min heap
    private int extractMin(MinimumHeapTree minimumHeapTree) {
        if (minimumHeapTree.getSize() <= 0) {
            return Integer.MAX_VALUE;
        }
        if (minimumHeapTree.getSize() == 1) {
            minimumHeapTree.setSize(minimumHeapTree.getSize() - 1);
            return minimumHeapTree.getVector().get(0);
        }
        int root = minimumHeapTree.getVector().get(0);
        minimumHeapTree.getVector().set(0, minimumHeapTree.getVector().get(minimumHeapTree.getSize() - 1));
        minimumHeapTree.setSize( minimumHeapTree.getSize() - 1 );
        heap(minimumHeapTree, 0);
        return root;
    }

    public void initiateHeapSort(Integer[] inputSize1_heap, Integer[] inputSize2_heap, Integer[] inputSize3_heap,
                                   Integer[] inputSize4_heap, Integer[] inputSize5_heap, Integer[] inputSize6_heap, Integer[] inputSize7_heap,
                                   Integer[] inputSize8_heap, Integer[] inputSize9_heap, Integer[] inputSize10_heap, Integer[] inputSize11_heap ) {
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Heap sort non-sorted array: ");
        long start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree1 = new MinimumHeapTree(inputSize1_heap.length);
        for (int i = 0; i < inputSize1_heap.length; i++) {
            insertKey(minHeapTree1, inputSize1_heap[i]);
        }
        for (int i = 0; i < inputSize1_heap.length; i++) {
            inputSize1_heap[i] = extractMin(minHeapTree1);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree2 = new MinimumHeapTree(inputSize2_heap.length);
        for (int i = 0; i < inputSize2_heap.length; i++) {
            insertKey(minHeapTree2, inputSize2_heap[i]);
        }
        for (int i = 0; i < inputSize2_heap.length; i++) {
            inputSize2_heap[i] = extractMin(minHeapTree2);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree3 = new MinimumHeapTree(inputSize3_heap.length);
        for (int i = 0; i < inputSize3_heap.length; i++) {
            insertKey(minHeapTree3, inputSize3_heap[i]);
        }
        for (int i = 0; i < inputSize3_heap.length; i++) {
            inputSize3_heap[i] = extractMin(minHeapTree3);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree4 = new MinimumHeapTree(inputSize4_heap.length);
        for (int i = 0; i < inputSize4_heap.length; i++) {
            insertKey(minHeapTree4, inputSize4_heap[i]);
        }
        for (int i = 0; i < inputSize4_heap.length; i++) {
            inputSize4_heap[i] = extractMin(minHeapTree4);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree5 = new MinimumHeapTree(inputSize5_heap.length);
        for (int i = 0; i < inputSize5_heap.length; i++) {
            insertKey(minHeapTree5, inputSize5_heap[i]);
        }
        for (int i = 0; i < inputSize5_heap.length; i++) {
            inputSize5_heap[i] = extractMin(minHeapTree5);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree6 = new MinimumHeapTree(inputSize6_heap.length);
        for (int i = 0; i < inputSize6_heap.length; i++) {
            insertKey(minHeapTree6, inputSize6_heap[i]);
        }
        for (int i = 0; i < inputSize6_heap.length; i++) {
            inputSize6_heap[i] = extractMin(minHeapTree6);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree7 = new MinimumHeapTree(inputSize7_heap.length);
        for (int i = 0; i < inputSize7_heap.length; i++) {
            insertKey(minHeapTree7, inputSize7_heap[i]);
        }
        for (int i = 0; i < inputSize7_heap.length; i++) {
            inputSize7_heap[i] = extractMin(minHeapTree7);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree8 = new MinimumHeapTree(inputSize8_heap.length);
        for (int i = 0; i < inputSize8_heap.length; i++) {
            insertKey(minHeapTree8, inputSize8_heap[i]);
        }
        for (int i = 0; i < inputSize8_heap.length; i++) {
            inputSize8_heap[i] = extractMin(minHeapTree8);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree9 = new MinimumHeapTree(inputSize9_heap.length);
        for (int i = 0; i < inputSize9_heap.length; i++) {
            insertKey(minHeapTree9, inputSize9_heap[i]);
        }
        for (int i = 0; i < inputSize9_heap.length; i++) {
            inputSize9_heap[i] = extractMin(minHeapTree9);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree10 = new MinimumHeapTree(inputSize10_heap.length);
        for (int i = 0; i < inputSize10_heap.length; i++) {
            insertKey(minHeapTree10, inputSize10_heap[i]);
        }
        for (int i = 0; i < inputSize10_heap.length; i++) {
            inputSize10_heap[i] = extractMin(minHeapTree10);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Heap sort sorted array: ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree11 = new MinimumHeapTree(inputSize1_heap.length);
        for (int i = 0; i < inputSize1_heap.length; i++) {
            insertKey(minHeapTree11, inputSize1_heap[i]);
        }
        for (int i = 0; i < inputSize1_heap.length; i++) {
            inputSize1_heap[i] = extractMin(minHeapTree11);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree12 = new MinimumHeapTree(inputSize2_heap.length);
        for (int i = 0; i < inputSize2_heap.length; i++) {
            insertKey(minHeapTree12, inputSize2_heap[i]);
        }
        for (int i = 0; i < inputSize2_heap.length; i++) {
            inputSize2_heap[i] = extractMin(minHeapTree12);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree13 = new MinimumHeapTree(inputSize3_heap.length);
        for (int i = 0; i < inputSize3_heap.length; i++) {
            insertKey(minHeapTree13, inputSize3_heap[i]);
        }
        for (int i = 0; i < inputSize3_heap.length; i++) {
            inputSize3_heap[i] = extractMin(minHeapTree13);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree14 = new MinimumHeapTree(inputSize4_heap.length);
        for (int i = 0; i < inputSize4_heap.length; i++) {
            insertKey(minHeapTree14, inputSize4_heap[i]);
        }
        for (int i = 0; i < inputSize4_heap.length; i++) {
            inputSize4_heap[i] = extractMin(minHeapTree14);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree15 = new MinimumHeapTree(inputSize5_heap.length);
        for (int i = 0; i < inputSize5_heap.length; i++) {
            insertKey(minHeapTree15, inputSize5_heap[i]);
        }
        for (int i = 0; i < inputSize5_heap.length; i++) {
            inputSize5_heap[i] = extractMin(minHeapTree15);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree16 = new MinimumHeapTree(inputSize6_heap.length);
        for (int i = 0; i < inputSize6_heap.length; i++) {
            insertKey(minHeapTree16, inputSize6_heap[i]);
        }
        for (int i = 0; i < inputSize6_heap.length; i++) {
            inputSize6_heap[i] = extractMin(minHeapTree16);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree17 = new MinimumHeapTree(inputSize7_heap.length);
        for (int i = 0; i < inputSize7_heap.length; i++) {
            insertKey(minHeapTree17, inputSize7_heap[i]);
        }
        for (int i = 0; i < inputSize7_heap.length; i++) {
            inputSize7_heap[i] = extractMin(minHeapTree17);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree18 = new MinimumHeapTree(inputSize8_heap.length);
        for (int i = 0; i < inputSize8_heap.length; i++) {
            insertKey(minHeapTree18, inputSize8_heap[i]);
        }
        for (int i = 0; i < inputSize8_heap.length; i++) {
            inputSize8_heap[i] = extractMin(minHeapTree18);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree19 = new MinimumHeapTree(inputSize9_heap.length);
        for (int i = 0; i < inputSize9_heap.length; i++) {
            insertKey(minHeapTree19, inputSize9_heap[i]);
        }
        for (int i = 0; i < inputSize9_heap.length; i++) {
            inputSize9_heap[i] = extractMin(minHeapTree19);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree20 = new MinimumHeapTree(inputSize10_heap.length);
        for (int i = 0; i < inputSize10_heap.length; i++) {
            insertKey(minHeapTree20, inputSize10_heap[i]);
        }
        for (int i = 0; i < inputSize10_heap.length; i++) {
            inputSize10_heap[i] = extractMin(minHeapTree20);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Heap sort reverse sorted array: ");
        Arrays.sort(inputSize1_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree21 = new MinimumHeapTree(inputSize1_heap.length);
        for (int i = 0; i < inputSize1_heap.length; i++) {
            insertKey(minHeapTree21, inputSize1_heap[i]);
        }
        for (int i = 0; i < inputSize1_heap.length; i++) {
            inputSize1_heap[i] = extractMin(minHeapTree21);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize2_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree22 = new MinimumHeapTree(inputSize2_heap.length);
        for (int i = 0; i < inputSize2_heap.length; i++) {
            insertKey(minHeapTree22, inputSize2_heap[i]);
        }
        for (int i = 0; i < inputSize2_heap.length; i++) {
            inputSize2_heap[i] = extractMin(minHeapTree22);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize3_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree23 = new MinimumHeapTree(inputSize3_heap.length);
        for (int i = 0; i < inputSize3_heap.length; i++) {
            insertKey(minHeapTree23, inputSize3_heap[i]);
        }
        for (int i = 0; i < inputSize3_heap.length; i++) {
            inputSize3_heap[i] = extractMin(minHeapTree23);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize4_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree24 = new MinimumHeapTree(inputSize4_heap.length);
        for (int i = 0; i < inputSize4_heap.length; i++) {
            insertKey(minHeapTree24, inputSize4_heap[i]);
        }
        for (int i = 0; i < inputSize4_heap.length; i++) {
            inputSize4_heap[i] = extractMin(minHeapTree24);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize5_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree25 = new MinimumHeapTree(inputSize5_heap.length);
        for (int i = 0; i < inputSize5_heap.length; i++) {
            insertKey(minHeapTree25, inputSize5_heap[i]);
        }
        for (int i = 0; i < inputSize5_heap.length; i++) {
            inputSize5_heap[i] = extractMin(minHeapTree25);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize6_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree26 = new MinimumHeapTree(inputSize6_heap.length);
        for (int i = 0; i < inputSize6_heap.length; i++) {
            insertKey(minHeapTree26, inputSize6_heap[i]);
        }
        for (int i = 0; i < inputSize6_heap.length; i++) {
            inputSize6_heap[i] = extractMin(minHeapTree26);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize7_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree27 = new MinimumHeapTree(inputSize7_heap.length);
        for (int i = 0; i < inputSize7_heap.length; i++) {
            insertKey(minHeapTree27, inputSize7_heap[i]);
        }
        for (int i = 0; i < inputSize7_heap.length; i++) {
            inputSize7_heap[i] = extractMin(minHeapTree27);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize8_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree28 = new MinimumHeapTree(inputSize8_heap.length);
        for (int i = 0; i < inputSize8_heap.length; i++) {
            insertKey(minHeapTree28, inputSize8_heap[i]);
        }
        for (int i = 0; i < inputSize8_heap.length; i++) {
            inputSize8_heap[i] = extractMin(minHeapTree28);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize9_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree29 = new MinimumHeapTree(inputSize9_heap.length);
        for (int i = 0; i < inputSize9_heap.length; i++) {
            insertKey(minHeapTree29, inputSize9_heap[i]);
        }
        for (int i = 0; i < inputSize9_heap.length; i++) {
            inputSize9_heap[i] = extractMin(minHeapTree29);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize10_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        MinimumHeapTree minHeapTree30 = new MinimumHeapTree(inputSize10_heap.length);
        for (int i = 0; i < inputSize10_heap.length; i++) {
            insertKey(minHeapTree30, inputSize10_heap[i]);
        }
        for (int i = 0; i < inputSize10_heap.length; i++) {
            inputSize10_heap[i] = extractMin(minHeapTree30);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
    }
}

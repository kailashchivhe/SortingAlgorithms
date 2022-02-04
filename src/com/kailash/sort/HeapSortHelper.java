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
        MinimumHeapTree minHeapTree = new MinimumHeapTree(inputSize1_heap.length);
        for (int i = 0; i < inputSize1_heap.length; i++) {
            insertKey(minHeapTree, inputSize1_heap[i]);
        }
        for (int i = 0; i < inputSize1_heap.length; i++) {
            inputSize1_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize2_heap.length);
        for (int i = 0; i < inputSize2_heap.length; i++) {
            insertKey(minHeapTree, inputSize2_heap[i]);
        }
        for (int i = 0; i < inputSize2_heap.length; i++) {
            inputSize2_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize3_heap.length);
        for (int i = 0; i < inputSize3_heap.length; i++) {
            insertKey(minHeapTree, inputSize3_heap[i]);
        }
        for (int i = 0; i < inputSize3_heap.length; i++) {
            inputSize3_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize4_heap.length);
        for (int i = 0; i < inputSize4_heap.length; i++) {
            insertKey(minHeapTree, inputSize4_heap[i]);
        }
        for (int i = 0; i < inputSize4_heap.length; i++) {
            inputSize4_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize5_heap.length);
        for (int i = 0; i < inputSize5_heap.length; i++) {
            insertKey(minHeapTree, inputSize5_heap[i]);
        }
        for (int i = 0; i < inputSize5_heap.length; i++) {
            inputSize5_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize6_heap.length);
        for (int i = 0; i < inputSize6_heap.length; i++) {
            insertKey(minHeapTree, inputSize6_heap[i]);
        }
        for (int i = 0; i < inputSize6_heap.length; i++) {
            inputSize6_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize7_heap.length);
        for (int i = 0; i < inputSize7_heap.length; i++) {
            insertKey(minHeapTree, inputSize7_heap[i]);
        }
        for (int i = 0; i < inputSize7_heap.length; i++) {
            inputSize7_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize8_heap.length);
        for (int i = 0; i < inputSize8_heap.length; i++) {
            insertKey(minHeapTree, inputSize8_heap[i]);
        }
        for (int i = 0; i < inputSize8_heap.length; i++) {
            inputSize8_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize9_heap.length);
        for (int i = 0; i < inputSize9_heap.length; i++) {
            insertKey(minHeapTree, inputSize9_heap[i]);
        }
        for (int i = 0; i < inputSize9_heap.length; i++) {
            inputSize9_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize10_heap.length);
        for (int i = 0; i < inputSize10_heap.length; i++) {
            insertKey(minHeapTree, inputSize10_heap[i]);
        }
        for (int i = 0; i < inputSize10_heap.length; i++) {
            inputSize10_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize10_heap.length);
        for (int i = 0; i < inputSize10_heap.length; i++) {
            insertKey(minHeapTree, inputSize11_heap[i]);
        }
        for (int i = 0; i < inputSize11_heap.length; i++) {
            inputSize11_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Heap sort sorted array: ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize1_heap.length);
        for (int i = 0; i < inputSize1_heap.length; i++) {
            insertKey(minHeapTree, inputSize1_heap[i]);
        }
        for (int i = 0; i < inputSize1_heap.length; i++) {
            inputSize1_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize2_heap.length);
        for (int i = 0; i < inputSize2_heap.length; i++) {
            insertKey(minHeapTree, inputSize2_heap[i]);
        }
        for (int i = 0; i < inputSize2_heap.length; i++) {
            inputSize2_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize3_heap.length);
        for (int i = 0; i < inputSize3_heap.length; i++) {
            insertKey(minHeapTree, inputSize3_heap[i]);
        }
        for (int i = 0; i < inputSize3_heap.length; i++) {
            inputSize3_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize4_heap.length);
        for (int i = 0; i < inputSize4_heap.length; i++) {
            insertKey(minHeapTree, inputSize4_heap[i]);
        }
        for (int i = 0; i < inputSize4_heap.length; i++) {
            inputSize4_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize5_heap.length);
        for (int i = 0; i < inputSize5_heap.length; i++) {
            insertKey(minHeapTree, inputSize5_heap[i]);
        }
        for (int i = 0; i < inputSize5_heap.length; i++) {
            inputSize5_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize6_heap.length);
        for (int i = 0; i < inputSize6_heap.length; i++) {
            insertKey(minHeapTree, inputSize6_heap[i]);
        }
        for (int i = 0; i < inputSize6_heap.length; i++) {
            inputSize6_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize7_heap.length);
        for (int i = 0; i < inputSize7_heap.length; i++) {
            insertKey(minHeapTree, inputSize7_heap[i]);
        }
        for (int i = 0; i < inputSize7_heap.length; i++) {
            inputSize7_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize8_heap.length);
        for (int i = 0; i < inputSize8_heap.length; i++) {
            insertKey(minHeapTree, inputSize8_heap[i]);
        }
        for (int i = 0; i < inputSize8_heap.length; i++) {
            inputSize8_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize9_heap.length);
        for (int i = 0; i < inputSize9_heap.length; i++) {
            insertKey(minHeapTree, inputSize9_heap[i]);
        }
        for (int i = 0; i < inputSize9_heap.length; i++) {
            inputSize9_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize10_heap.length);
        for (int i = 0; i < inputSize10_heap.length; i++) {
            insertKey(minHeapTree, inputSize10_heap[i]);
        }
        for (int i = 0; i < inputSize10_heap.length; i++) {
            inputSize10_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize11_heap.length);
        for (int i = 0; i < inputSize11_heap.length; i++) {
            insertKey(minHeapTree, inputSize11_heap[i]);
        }
        for (int i = 0; i < inputSize11_heap.length; i++) {
            inputSize11_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Heap sort reverse sorted array: ");
        Arrays.sort(inputSize1_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize1_heap.length);
        for (int i = 0; i < inputSize1_heap.length; i++) {
            insertKey(minHeapTree, inputSize1_heap[i]);
        }
        for (int i = 0; i < inputSize1_heap.length; i++) {
            inputSize1_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize2_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize2_heap.length);
        for (int i = 0; i < inputSize2_heap.length; i++) {
            insertKey(minHeapTree, inputSize2_heap[i]);
        }
        for (int i = 0; i < inputSize2_heap.length; i++) {
            inputSize2_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize3_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize3_heap.length);
        for (int i = 0; i < inputSize3_heap.length; i++) {
            insertKey(minHeapTree, inputSize3_heap[i]);
        }
        for (int i = 0; i < inputSize3_heap.length; i++) {
            inputSize3_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize4_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize4_heap.length);
        for (int i = 0; i < inputSize4_heap.length; i++) {
            insertKey(minHeapTree, inputSize4_heap[i]);
        }
        for (int i = 0; i < inputSize4_heap.length; i++) {
            inputSize4_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize5_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize5_heap.length);
        for (int i = 0; i < inputSize5_heap.length; i++) {
            insertKey(minHeapTree, inputSize5_heap[i]);
        }
        for (int i = 0; i < inputSize5_heap.length; i++) {
            inputSize5_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize6_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize6_heap.length);
        for (int i = 0; i < inputSize6_heap.length; i++) {
            insertKey(minHeapTree, inputSize6_heap[i]);
        }
        for (int i = 0; i < inputSize6_heap.length; i++) {
            inputSize6_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize7_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize7_heap.length);
        for (int i = 0; i < inputSize7_heap.length; i++) {
            insertKey(minHeapTree, inputSize7_heap[i]);
        }
        for (int i = 0; i < inputSize7_heap.length; i++) {
            inputSize7_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize8_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize8_heap.length);
        for (int i = 0; i < inputSize8_heap.length; i++) {
            insertKey(minHeapTree, inputSize8_heap[i]);
        }
        for (int i = 0; i < inputSize8_heap.length; i++) {
            inputSize8_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize9_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize9_heap.length);
        for (int i = 0; i < inputSize9_heap.length; i++) {
            insertKey(minHeapTree, inputSize9_heap[i]);
        }
        for (int i = 0; i < inputSize9_heap.length; i++) {
            inputSize9_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize10_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize10_heap.length);
        for (int i = 0; i < inputSize10_heap.length; i++) {
            insertKey(minHeapTree, inputSize10_heap[i]);
        }
        for (int i = 0; i < inputSize10_heap.length; i++) {
            inputSize10_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        Arrays.sort(inputSize11_heap, Collections.reverseOrder());
        start = System.currentTimeMillis();
        minHeapTree = new MinimumHeapTree(inputSize11_heap.length);
        for (int i = 0; i < inputSize11_heap.length; i++) {
            insertKey(minHeapTree, inputSize11_heap[i]);
        }
        for (int i = 0; i < inputSize11_heap.length; i++) {
            inputSize11_heap[i] = extractMin(minHeapTree);
        }
        System.out.print(System.currentTimeMillis() - start + "ms" + " " + " ");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
    }
}

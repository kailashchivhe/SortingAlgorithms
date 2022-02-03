package com.kailash.model;

import java.util.Vector;

public class MinimumHeapTree {
    private int size;
    private int capacity;
    private Vector<Integer> vector;

    public MinimumHeapTree(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        vector = new Vector<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Vector<Integer> getVector() {
        return vector;
    }

    public void setVector(Vector<Integer> vector) {
        this.vector = vector;
    }
}

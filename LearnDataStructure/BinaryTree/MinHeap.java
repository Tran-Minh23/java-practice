package LearnDataStructure.BinaryTree;

import java.util.ArrayList;

public class MinHeap {
    public int length;
    private ArrayList<Integer> data;

    MinHeap() {
        this.data = new ArrayList<>();
        this.length = 0;
    }

    public void insert(int value) {
        this.data.add(value);
        this.heapifyUp(this.length);
        this.length++;
    }

    public int delete() {
        if (this.length == 0) {
            return -1;
        }

        int out = this.data.get(0);
        this.length--;

        if (this.length == 0) {
            this.data = new ArrayList<>();
            return out;
        }

        this.data.set(0, this.data.get(this.length));
        this.heapifyDown(0);

        return out;
    }

    private void heapifyUp(int idx) {
        if (idx == 0) {
            return;
        }

        int p = this.parent(idx);
        int parentValue = this.data.get(p);
        int v = this.data.get(idx);

        if (parentValue > v) {
            this.data.set(idx, parentValue);
            this.data.set(p, v);

            this.heapifyUp(p);
        }
    }

    private void heapifyDown(int idx) {
        int lIdx = this.leftChild(idx);
        int rIdx = this.rightChild(idx);

        if (idx >= this.length || lIdx >= this.length) {
            return;
        }

        int lV = this.data.get(lIdx);
        int rV = this.data.get(rIdx);
        int v = this.data.get(idx);

        if (lV > rV && v > rV) {
            this.data.set(idx, rV);
            this.data.set(rIdx, v);
            this.heapifyDown(rIdx);
        } else if (rV > lV && v > lV) {
            this.data.set(idx, lV);
            this.data.set(lIdx, v);
            this.heapifyDown(lIdx);
        }
    }

    private int parent(int idx) {
        return (int) Math.floor((idx - 1) / 2);
    }

    private int leftChild(int idx) {
        return idx * 2 + 1;
    }

    private int rightChild(int idx) {
        return idx * 2 + 2;
    }
}

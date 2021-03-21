package com.snack.leetcode.n295;

import java.util.PriorityQueue;

public class MedianFinder {

    int count;
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        count = 0;
        maxHeap = new PriorityQueue<>((x, y) -> y - x);
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        count++;
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if ((count & 1) != 0) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if ((count & 1) == 0) {
            return (double) (minHeap.peek() + maxHeap.peek()) / 2;
        } else {
            return (double) maxHeap.peek();
        }
    }
}

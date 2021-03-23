package com.snack.leetcode.n239;

import java.util.LinkedList;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotonicQueue mq = new MonotonicQueue();
        int n = nums.length;
        int[] rtn = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            mq.push(nums[i]);
            if (i < k - 1) {
                continue;
            }
            rtn[i - k + 1] = mq.max();
            mq.pop(nums[i - k + 1]);
        }
        return rtn;
    }

}

class MonotonicQueue {
    LinkedList<Integer> queue = new LinkedList<>();

    // 在队尾添加元素 n
    void push(int n) {
        while (!queue.isEmpty() && queue.getLast() < n) {
            queue.pollLast();
        }
        queue.addLast(n);
    }

    // 返回当前队列中的最大值
    int max() {
        return queue.getFirst();

    }

    // 队头元素如果是 n，删除它
    void pop(int n) {
        if (queue.getFirst() == n) {
            queue.pollFirst();
        }
    }
}
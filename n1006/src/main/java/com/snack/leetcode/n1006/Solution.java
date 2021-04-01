package com.snack.leetcode.n1006;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public int clumsy(int N) {
        if (N <= 0) {
            return 0;
        }
        Deque<Integer> vStack = new LinkedList<>();
        for (int i = N; i > 0; i--) {
            if (i == N) {
                vStack.push(i);
            } else if ((N - i - 1) % 4 == 2) {
                vStack.push(i);
            } else if ((N - i - 1) % 4 == 3) {
                vStack.push(-i);
            } else if ((N - i - 1) % 4 == 0) {
                vStack.push(vStack.pop() * i);
            } else if ((N - i - 1) % 4 == 1) {
                vStack.push(vStack.pop() / i);
            }
        }
        int sum = 0;
        while (!vStack.isEmpty()) {
            sum += vStack.pop();
        }
        return sum;
    }
}

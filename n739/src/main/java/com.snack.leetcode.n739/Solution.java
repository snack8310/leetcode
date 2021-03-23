package com.snack.leetcode.n739;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        Deque<Integer> days = new ArrayDeque<>();
        int n = T.length;
        int[] rtn = new int[n];
        for (int i = 0; i < n; i++) {
            while (!days.isEmpty() && T[days.peek()] < T[i]) {
                int day = days.poll();
                rtn[day] = i - day;
            }
            days.push(i);
        }
        return rtn;
    }
}

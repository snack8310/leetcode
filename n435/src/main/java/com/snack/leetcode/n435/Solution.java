package com.snack.leetcode.n435;

import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
        int rtn = 0;
        int right = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (right <= intervals[i][0]) {
                right = intervals[i][1];
                continue;
            }
            rtn++;
        }
        return rtn;
    }
}

package com.snack.leetcode.n56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a1, a2) -> a1[0] == a2[0] ? a1[1] - a2[1] : a1[0] - a2[0]);
        List<int[]> ret = new ArrayList<>();
        int n = intervals.length;
        int[] last = intervals[0];
        for (int i = 1; i < n; i++) {
            int[] interval = intervals[i];
            if (interval[0] > last[1]) {
                ret.add(last);
                last = interval;
                continue;
            }
            last[1] = Math.max(last[1], interval[1]);
        }
        ret.add(last);
        return ret.toArray(new int[][]{});
    }
}

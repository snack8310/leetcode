package com.snack.leetcode.n452;

import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(points, (o1, o2) ->  o1[1] < o2[1] ? -1 : 1);
        int right = points[0][1];
        int rtn = 1;
        for (int i = 0; i < n; i++) {
            if (points[i][0] <= right) {
                continue;
            }
            right = points[i][1];
            rtn++;
        }
        return rtn;
    }
}

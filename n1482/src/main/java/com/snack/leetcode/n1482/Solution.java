package com.snack.leetcode.n1482;

public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m > bloomDay.length / k) {
            return -1;
        }
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            lo = Math.min(lo, day);
            hi = Math.max(hi, day);
        }
        while (lo < hi) {
            int day = lo + (hi - lo) / 2;
            if (canMake(day, bloomDay, m, k)) {
                hi = day;
            } else {
                lo = day + 1;
            }
        }
        return lo;
    }

    private boolean canMake(int day, int[] bloomDay, int m, int k) {
        int ci = 0;
        int fi = 0;
        for (int b : bloomDay) {
            if (b > day) {
                ci = 0;
                continue;
            }
            ci++;
            if (ci == k) {
                fi++;
                ci = 0;
            }
            if (fi >= m) {
                return true;
            }
        }
        return false;
    }
}

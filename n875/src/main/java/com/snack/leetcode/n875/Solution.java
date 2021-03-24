package com.snack.leetcode.n875;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles) + 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canFinish(int[] piles, int h, int mid) {
        int time = 0;
        for (int n : piles) {
            time += getTime(n, mid);
        }
        return time <= h;
    }

    private int getTime(int n, int mid) {
        return n / mid + (n % mid == 0 ? 0 : 1);
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int n : piles)
            max = Math.max(n, max);
        return max;
    }
}

package com.snack.leetcode.n1011;

public class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int left = getMax(weights);
        int right = getSum(weights);
        while (left < right) {
            int mid = (left + right) / 2;
            if (canFinish(weights, D, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }

    private int getMax(int[] weights) {
        int max = 0;
        for (int weight : weights) {
            max = Math.max(weight, max);
        }
        return max;
    }

    private boolean canFinish(int[] weights, int D, int mid) {
        int day = 1;
        int sum = 0;
        for (int weight : weights) {
            if(sum + weight > mid){
                day++;
                sum = weight;
            }else {
                sum += weight;
            }

        }
        return day <= D;
    }

}

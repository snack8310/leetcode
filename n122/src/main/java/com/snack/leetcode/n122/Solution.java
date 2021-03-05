package com.snack.leetcode.n122;

public class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice < prices[i]) {
                mp += prices[i] - minPrice;
            }
            minPrice = prices[i];
        }
        return mp;
    }
}

package com.snack.leetcode.n121;

public class Solution2 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int mp = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > mp) {
                mp = prices[i] - minPrice;
            }

        }
        return mp;
    }
}

package com.snack.leetcode.n121;

public class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                mp = mp < prices[j] - prices[i] ? prices[j] - prices[i] : mp;
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        int[] prices = {10, 14, 15, 18, 14, 22};
        Solution s = new Solution();
        System.out.println(s.maxProfit(prices));
    }
}

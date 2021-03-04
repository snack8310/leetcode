package com.snack.leetcode.n121;

public class Solution2 {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int mp = 0;
        for (int i = 0; i < prices.length; i++) {
            if (lowest > prices[i]) {
                lowest = prices[i];
            } else if (prices[i] - lowest > mp) {
                mp = prices[i] - lowest;
            }

        }
        return mp;
    }

    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
//         int[] prices = {7, 1, 5, 3, 6, 4};
        Solution2 s = new Solution2();
        System.out.println(s.maxProfit(prices));
    }
}

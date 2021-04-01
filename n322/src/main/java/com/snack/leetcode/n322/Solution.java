package com.snack.leetcode.n322;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] df = new int[max];
        Arrays.fill(df, max);
        df[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    df[i] = Math.min(df[i], df[i - coins[j]] + 1);
                }
            }
        }
        return df[amount] > amount ? -1 : df[amount];
    }
}

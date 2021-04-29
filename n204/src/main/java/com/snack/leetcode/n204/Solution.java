package com.snack.leetcode.n204;

public class Solution {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + (isPrime(i) ? 1 : 0);
        }
        return dp[n - 1];
    }

    private boolean isPrime(int K) {
        for (int i = 2; i * i <= K; ++i) {
            if (K % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package com.snack.leetcode.n204;

public class Solution2 {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int ans = 0;
        for (int i = 2; i < n; i++) {
            ans += (isPrime(i) ? 1 : 0);
        }
        return ans;
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

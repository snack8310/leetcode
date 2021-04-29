package com.snack.leetcode.n204;

import java.util.Arrays;

public class Solution4 {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrime[i] ? 1 : 0;
        }
        return count;
    }


}

package com.snack.leetcode.n1442;

public class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length, ans = 0;
        int[] preXor = new int[n + 1];
        for (int i = 0; i < n; ++i)
            preXor[i + 1] = preXor[i] ^ arr[i];
        for (int i = 1; i <= n; ++i)
            for (int k = i + 1; k <= n; ++k)
                if (preXor[i - 1] == preXor[k])
                    ans += k - i;
        return ans;
    }
}

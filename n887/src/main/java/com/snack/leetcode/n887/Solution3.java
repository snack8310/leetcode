package com.snack.leetcode.n887;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    Map<String, Integer> memo = new HashMap<>();

    public int superEggDrop(int k, int n) {
        return dp(k, n);
    }

    int dp(int k, int n) {
        if (k == 1) {
            return n;
        }
        if (k == 0) {
            return 0;
        }
        if (memo.containsKey("0" + k + n)) {
            return memo.get("0" + k + n);
        }
        int ret = n * n;
        for (int i = 1; i < n + 1; i++) {
            ret = Math.min(ret, 1 + Math.max(dp(k, n - i), dp(k - 1, i - 1)));
        }
        memo.put("0" + k + n, ret);
        return ret;
    }
}

package com.snack.leetcode.n509;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> fv;

    public int fib(int n) {
        fv = new HashMap<>();
        fv.put(0, 0);
        fv.put(1, 1);
        return f(n);
    }

    private int f(int n) {
        if (fv.containsKey(n)) {
            return fv.get(n);
        }
        int v = f(n - 1) + f(n - 2);
        fv.put(n, v);
        return v;
    }
}

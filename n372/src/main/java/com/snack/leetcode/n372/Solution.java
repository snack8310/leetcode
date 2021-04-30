package com.snack.leetcode.n372;

import java.util.LinkedList;

public class Solution {
    int base = 1337;

    public int superPow(int a, int[] b) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int bb : b) {
            list.add(bb);
        }
        return superPow(a, list);
    }

    private int superPow(int a, LinkedList<Integer> b) {
        if (b.isEmpty()) {
            return 1;
        }
        int last = b.getLast();
        b.pollLast();
        int res = mypow(a, last);
        int res2 = mypow(superPow(a, b), 10);
        return res * res2 % base;
    }

    int mypow(int a, int k) {
        if (k == 0) {
            return 1;
        }
        a %= base;
        if (k % 2 == 1) {
            return (a * mypow(a, k - 1)) % base;
        }
        int sub = mypow(a, k / 2);
        return (sub * sub) % base;
    }
}

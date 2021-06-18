package com.snack.leetcode.n483;

public class Solution {
    public String smallestGoodBase(String n) {
        // k*0+1,k*1+1,K*2+1
        // k*(0+1+2+i)+1*(i+1)
        // K* (i+0)*(i+1)/2 + i+1
        long nVal = Long.parseLong(n);
        int mMax = (int) Math.floor(Math.log(nVal) / Math.log(2));
        for (int m = mMax; m > 1; m--) {
            int k = (int) Math.pow(nVal, 1.0 / m);
            long mul = 1, sum = 1;
            for (int i = 0; i < m; i++) {
                mul *= k;
                sum += mul;
            }
            if (sum == nVal) {
                return Integer.toString(k);
            }
        }
        return Long.toString(nVal - 1);
    }
}

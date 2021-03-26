package com.snack.leetcode.n344;

public class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

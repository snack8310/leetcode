package com.snack.leetcode.n415;

public class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length();
        int j = num2.length();
        int makeup = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 1 || j >= 1 || makeup > 0) {
            int n1 = i < 1 ? 0 : num1.charAt(i - 1) - '0';
            int n2 = j < 1 ? 0 : num2.charAt(j - 1) - '0';
            sb.insert(0, (n1 + n2 + makeup) % 10);
            makeup = (n1 + n2 + makeup) / 10;
            i--;
            j--;
        }
        return sb.toString();
    }
}

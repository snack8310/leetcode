package com.snack.leetcode.n227;

import java.util.Stack;

public class Solution {

    private final char O_PLUS = '+';
    private final char O_MINUS = '-';
    private final char O_MULTIPLY = '*';
    private final char O_DIVIDE = '/';
    private final char O_OPEN_PAREN = '(';
    private final char O_CLOSE_PAREN = ')';
    private final char O_BLANK = ' ';

    private Stack<Integer> nums = new Stack<Integer>();

    public int calculate(String s) {
        int n = s.length();
        int num = 0;
        char preSign = '+';
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == O_BLANK) {
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (i == n - 1 || s.charAt(i) == O_PLUS || s.charAt(i) == O_MINUS || s.charAt(i) == O_MULTIPLY || s.charAt(i) == O_DIVIDE) {
                if (preSign == O_PLUS) {
                    nums.push(num);
                } else if (preSign == O_MINUS) {
                    nums.push(-num);
                } else if (preSign == O_MULTIPLY) {
                    nums.push(nums.pop() * num);
                } else if (preSign == O_DIVIDE) {
                    nums.push(nums.pop() / num);
                }
                num = 0;
                preSign = s.charAt(i);
            }
        }
        int ret = 0;
        while (!nums.empty()) {
            ret += nums.pop();
        }
        return ret;
    }
}

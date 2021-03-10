package com.snack.leetcode.n224;

import java.util.Stack;
import java.util.Vector;

public class Solution {

    private final char O_PLUS = '+';
    private final char O_MINUS = '-';
    private final char O_MULTIPLY = '*';
    private final char O_DIVIDE= '/';
    private final char O_OPEN_PAREN = '(';
    private final char O_CLOSE_PAREN = ')';
    private final char O_BLANK = ' ';

    public int calculate(String s) {
        Stack<Integer> ops = new Stack<Integer>();
        int ret = 0;
        int sign = 1;
        ops.push(sign);
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == O_BLANK) {
                i++;
            } else if (s.charAt(i) == O_PLUS) {
                sign = ops.peek();
                i++;
            } else if (s.charAt(i) == O_MINUS) {
                sign = -ops.peek();
                i++;
            } else if (s.charAt(i) == O_OPEN_PAREN) {
                ops.push(sign);
                i++;
            } else if (s.charAt(i) == O_CLOSE_PAREN) {
                ops.pop();
                i++;
            } else {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                ret += num * sign;
            }
        }
        return ret;
    }

}

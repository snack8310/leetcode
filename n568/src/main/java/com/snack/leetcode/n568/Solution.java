package com.snack.leetcode.n568;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        int n = tokens.length;

        Stack<Integer> stack = new Stack<>();

        int p, q;
        for (int i = 0; i < n; i++) {
            if ("+".equals(tokens[i])) {
                q = stack.pop();
                p = stack.pop();
                stack.push(p + q);
            } else if ("-".equals(tokens[i])) {
                q = stack.pop();
                p = stack.pop();
                stack.push(p - q);
            } else if ("*".equals(tokens[i])) {
                q = stack.pop();
                p = stack.pop();
                stack.push(p * q);
            } else if ("/".equals(tokens[i])) {
                q = stack.pop();
                p = stack.pop();
                stack.push(p / q);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();

    }
}

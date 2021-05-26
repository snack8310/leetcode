package com.snack.leetcode.n1190;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {
    public String reverseParentheses(String s) {
        Deque<String> stack = new LinkedList<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                String ss = stack.pop();
                sb.reverse();
                sb.insert(0, ss);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

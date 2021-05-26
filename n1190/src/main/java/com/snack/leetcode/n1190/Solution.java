package com.snack.leetcode.n1190;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public String reverseParentheses(String s) {
        Deque<String> stack = new LinkedList<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(sb.toString());
                sb = new StringBuilder();
            } else if (ch == ')') {
                String ss = stack.pop();
                String cs = reverse(sb.toString());
                sb = new StringBuilder();
                sb.append(ss);
                sb.append(cs);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.insert(0, ch);
        }
        return sb.toString();
    }
}

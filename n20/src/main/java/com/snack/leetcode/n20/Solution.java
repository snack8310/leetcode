package com.snack.leetcode.n20;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }
            if (ch == ')' && (stack.isEmpty() || ('(' != stack.poll()))) {
                return false;
            }
            if (ch == ']' && (stack.isEmpty() || ('[' != stack.poll()))) {
                return false;
            }
            if (ch == '}' && (stack.isEmpty() || ('{' != stack.poll()))) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

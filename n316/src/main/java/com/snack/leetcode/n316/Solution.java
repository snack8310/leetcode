package com.snack.leetcode.n316;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {

    Deque<Character> stack;
    Map<Character, Integer> count;

    public String removeDuplicateLetters(String s) {
        stack = new LinkedList<>();
        count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
            if (stack.contains(c)) {
                continue;
            }
            while (!stack.isEmpty() && c < stack.peek()) {
                if (count.get(stack.peek()) == 0) {
                    break;
                }
                stack.pop();
            }
            stack.push(c);
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

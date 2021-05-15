package com.snack.leetcode.n394;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public String decodeString(String s) {
        Deque<String> strings = new LinkedList<>();
        Deque<Integer> nums = new LinkedList<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = 10 * num + (ch - '0');
                continue;
            }
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
                continue;
            }
            if (ch == '[') {
                nums.push(num);
                num = 0;
                strings.push(sb.toString());
                sb = new StringBuilder();
                continue;
            }
            if (ch == ']') {
                int times = nums.pop();
                String block = sb.toString();
                for (int j = 1; j < times; j++) {
                    sb.append(block);
                }
                sb.insert(0, strings.pop());
                continue;
            }
        }
        return sb.toString();
    }
}

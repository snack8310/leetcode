package com.snack.leetcode.n1047;

import java.util.Stack;

public class Solution3 {
    public String removeDuplicates(String S) {
        int n = S.length();
        Stack<Character> ds = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && S.charAt(i) == S.charAt(i + 1)) {
                while (!ds.empty() && i + 2 < n && ds.peek() == S.charAt(i + 2)) {
                    ds.pop();
                    i++;
                }
                i++;
                continue;
            }
            ds.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : ds) {
            sb.append(c);
        }
        return sb.toString();
    }
}

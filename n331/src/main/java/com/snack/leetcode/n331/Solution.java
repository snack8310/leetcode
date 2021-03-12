package com.snack.leetcode.n331;

import java.util.*;

public class Solution {

    public boolean isValidSerialization(String preorder) {
        Deque<String> stack = new LinkedList<>();
        int i = 0;
        int n = preorder.length();

        while (i < n) {
            if (preorder.charAt(i) == ',') {
                i++;
                continue;
            } else if (preorder.charAt(i) == '#') {
                stack.push("#");
                i++;
            } else {
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                stack.push("1");
                i++;
            }

            combine(stack);

        }

        if (stack.size() == 1 && "#".equals(stack.pop())) {
            return true;
        }
        return false;
    }

    private void combine(Deque<String> stack) {
        if (stack.size() >= 3) {
            String l1 = stack.pop();
            String l2 = stack.pop();
            String l3 = stack.pop();
            if ("1".equals(l3) && "#".equals(l2) && "#".equals(l1)) {
                stack.push("#");
                combine(stack);
            } else {
                stack.push(l3);
                stack.push(l2);
                stack.push(l1);
            }
        }
    }
}

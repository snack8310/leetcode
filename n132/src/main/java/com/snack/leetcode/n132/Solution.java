package com.snack.leetcode.n132;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int min = Integer.MAX_VALUE;

    public int minCut(String s) {
        List<String> leftPath = new ArrayList<String>();
        backtracking(leftPath, s);
        return min;
    }


    private void backtracking(List<String> leftPath, String rights) {
        if (rights.length() == 0) {
            min = leftPath.size() - 1 > min ? min : leftPath.size() - 1;
            return;
        }
        int length = rights.length();
        List<String> list;
        for (int i = 0; i < length; i++) {
            if (isPalindrome(rights.substring(0, i + 1))) {
                list = new ArrayList<String>();
                list.addAll(leftPath);
                list.add(rights.substring(0, i + 1));
                backtracking(list, rights.substring(i + 1, length));
            }
        }
    }

    private boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

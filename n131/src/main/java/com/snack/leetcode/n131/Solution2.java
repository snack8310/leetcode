package com.snack.leetcode.n131;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    List<List<String>> ret = new ArrayList<List<String>>();

    public List<List<String>> partition(String s) {
        List<String> leftPath = new ArrayList<String>();
        backtracking(leftPath, s);
        return ret;
    }

    private void backtracking(List<String> leftPath, String rights) {
        if (rights.length() == 0) {
            ret.add(leftPath);
            return;
        }
        int length = rights.length();
        List<String> list;
        for (int i = 0; i < length; i++) {
            list = new ArrayList<String>();
            if (isPalindrome(rights.substring(0, i + 1))) {
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

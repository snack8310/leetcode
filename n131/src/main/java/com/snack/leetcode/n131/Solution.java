package com.snack.leetcode.n131;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<List<String>>();
        int length = s.length();
        List<String> rs;
        for (int i = 0; i < length; i++) {
            String lefts = s.substring(0, i + 1);
            if (isPalindrome(lefts)) {
                List<List<String>> retp = partition(s.replaceFirst(lefts, ""));
                if (retp.size() == 0) {
                    rs = new ArrayList<String>();
                    rs.add(lefts);
                    ret.add(rs);
                    continue;
                }
                for (List<String> rsp : retp) {
                    rs = new ArrayList<String>();
                    rs.add(lefts);
                    rs.addAll(rsp);
                    ret.add(rs);
                }
            }
        }
        return ret;
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

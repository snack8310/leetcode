package com.snack.leetcode.n792;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            List<Integer> list = pos.getOrDefault(ch, new ArrayList<>());
            list.add(i);
            pos.put(ch, list);
        }
        int ret = 0;
        for (String word : words) {
            ret += dfs(word, 0, pos, 0);
        }
        return ret;
    }

    private int dfs(String word, int index, Map<Character, List<Integer>> pos, int path) {
        if (index == word.length()) {
            return 1;
        }
        char ch = word.charAt(index);
        List<Integer> cpos = pos.getOrDefault(ch, new ArrayList<>());
        for (Integer p : cpos) {
            if (p >= path) {
                return dfs(word, index + 1, pos, p + 1);
            }
        }
        return 0;
    }
}
package com.snack.leetcode.n46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack(res, output, 0, n);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> output, int first, int n) {
        if (first == n) {
            res.add(new ArrayList<>(output));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(output, first, i);
            backtrack(res, output, first + 1, n);
            Collections.swap(output, first, i);
        }
    }
}

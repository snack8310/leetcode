package com.snack.leetcode.n368;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void largestDivisibleSubset() {
        int[] nums = {1, 2, 3};
        List<Integer> out = s.largestDivisibleSubset(nums);
    }
}
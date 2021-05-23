package com.snack.leetcode.n1707;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void maximizeXor() {
        int[] nums = {0, 1, 2, 3, 4};
        int[][] queries = {{3, 1}, {1, 3}, {5, 6}};
        int[] out = s.maximizeXor(nums, queries);
        int[] expected = {3, 3, 7};
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void maximizeXor2() {
        int[] nums = {5, 2, 4, 6, 6, 3};
        int[][] queries = {{12, 4}, {8, 1}, {6, 3}};
        int[] out = s.maximizeXor(nums, queries);
        int[] expected = {15, -1, 5};
        Assert.assertArrayEquals(expected, out);
    }
}
package com.snack.leetcode.n1310;

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
    public void xorQueries() {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] out = s.xorQueries(arr, queries);
        int[] excepted = {2, 7, 14, 8};
        Assert.assertArrayEquals(excepted, out);
    }

    @Test
    public void xorQueries2() {
        int[] arr = {4, 8, 2, 10};
        int[][] queries = {{2, 3}, {1, 3}, {0, 0}, {0, 3}};
        int[] out = s.xorQueries(arr, queries);
        int[] excepted = {8, 0, 4, 4};
        Assert.assertArrayEquals(excepted, out);
    }
}
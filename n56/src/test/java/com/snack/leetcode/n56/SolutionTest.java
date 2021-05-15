package com.snack.leetcode.n56;

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
    public void merge() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] out = s.merge(intervals);
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        Assert.assertEquals(expected.length, out.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], out[i]);
        }
    }

    @Test
    public void merge2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] out = s.merge(intervals);
        int[][] expected = {{1, 5}};
        Assert.assertEquals(expected.length, out.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], out[i]);
        }
    }
}
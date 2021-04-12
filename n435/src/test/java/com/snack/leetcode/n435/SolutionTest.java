package com.snack.leetcode.n435;

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
    public void eraseOverlapIntervals() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int out = s.eraseOverlapIntervals(intervals);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void eraseOverlapIntervals2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        int out = s.eraseOverlapIntervals(intervals);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void eraseOverlapIntervals3() {
        int[][] intervals = {{1, 2}, {2, 3}};
        int out = s.eraseOverlapIntervals(intervals);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}
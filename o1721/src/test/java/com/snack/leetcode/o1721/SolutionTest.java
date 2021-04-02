package com.snack.leetcode.o1721;

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
    public void trap() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int out = s.trap(height);
        int expert = 6;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void trap2() {
        int[] height = {};
        int out = s.trap(height);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}
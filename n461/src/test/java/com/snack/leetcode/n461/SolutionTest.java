package com.snack.leetcode.n461;

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
    public void hammingDistance() {
        int x = 1;
        int y = 4;
        int out = s.hammingDistance(x, y);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}
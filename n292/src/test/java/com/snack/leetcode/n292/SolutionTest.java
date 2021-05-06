package com.snack.leetcode.n292;

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
    public void canWinNim() {
        int n = 4;
        boolean out = s.canWinNim(n);
        Assert.assertFalse(out);
    }

    @Test
    public void canWinNim2() {
        int n = 1;
        boolean out = s.canWinNim(n);
        Assert.assertTrue(out);
    }

    @Test
    public void canWinNim3() {
        int n = 2;
        boolean out = s.canWinNim(n);
        Assert.assertTrue(out);
    }
}
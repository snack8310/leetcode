package com.snack.leetcode.n319;

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
    public void bulbSwitch() {
        int n = 3;
        int out = s.bulbSwitch(n);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void bulbSwitch2() {
        int n = 0;
        int out = s.bulbSwitch(n);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void bulbSwitch3() {
        int n = 1;
        int out = s.bulbSwitch(n);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }
}
package com.snack.leetcode.n372;

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
    public void superPow() {
        int a = 2;
        int[] b = {3};
        int out = s.superPow(a, b);
        int expert = 8;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void superPow2() {
        int a = 2;
        int[] b = {1, 0};
        int out = s.superPow(a, b);
        int expert = 1024;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void superPow3() {
        int a = 1;
        int[] b = {4, 3, 3, 8, 5, 2};
        int out = s.superPow(a, b);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void superPow4() {
        int a = 2147483647;
        int[] b = {2, 0, 0};
        int out = s.superPow(a, b);
        int expert = 1198;
        Assert.assertEquals(expert, out);
    }
}
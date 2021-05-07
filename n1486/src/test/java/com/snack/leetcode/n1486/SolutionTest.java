package com.snack.leetcode.n1486;

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
    public void xorOperation() {
        int n = 5;
        int start = 0;
        int out = s.xorOperation(n, start);
        int expert = 8;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void xorOperation2() {
        int n = 4;
        int start = 3;
        int out = s.xorOperation(n, start);
        int expert = 8;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void xorOperation3() {
        int n = 1;
        int start = 7;
        int out = s.xorOperation(n, start);
        int expert = 7;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void xorOperation4() {
        int n = 10;
        int start = 5;
        int out = s.xorOperation(n, start);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}
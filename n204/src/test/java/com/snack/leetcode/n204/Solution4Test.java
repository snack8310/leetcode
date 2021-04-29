package com.snack.leetcode.n204;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution4Test {

    Solution4 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution4();
    }

    @Test
    public void countPrimes() {
        int n = 10;
        int out = s.countPrimes(n);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void countPrimes2() {
        int n = 0;
        int out = s.countPrimes(n);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void countPrimes3() {
        int n = 1;
        int out = s.countPrimes(n);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void countPrimes4() {
        int n = 5;
        int out = s.countPrimes(n);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void countPrimes5() {
        int n = 3;
        int out = s.countPrimes(n);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void countPrimes6() {
        int n = 5000000;
        int out = s.countPrimes(n);
        int expert = 348513;
        Assert.assertEquals(expert, out);
    }
}
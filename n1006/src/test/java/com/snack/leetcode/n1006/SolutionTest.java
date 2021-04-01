package com.snack.leetcode.n1006;

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
    public void clumsy() {
        int N = 4;
        int out = s.clumsy(N);
        int expert = 7;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void clumsy2() {
        int N = 10;
        int out = s.clumsy(N);
        int expert = 12;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void clumsy3() {
        int N = 1;
        int out = s.clumsy(N);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void clumsy4() {
        int N = 2;
        int out = s.clumsy(N);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}
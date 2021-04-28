package com.snack.leetcode.n793;

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
    public void preimageSizeFZF() {
        int K = 0;
        int out = s.preimageSizeFZF(K);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void preimageSizeFZF2() {
        int K = 5;
        int out = s.preimageSizeFZF(K);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}
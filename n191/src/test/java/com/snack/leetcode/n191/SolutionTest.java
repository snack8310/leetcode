package com.snack.leetcode.n191;

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
    public void hammingWeight() {
        int n = 00000000000000000000000000001011;
        int out = s.hammingWeight(n);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void hammingWeight2() {
        int n = 00000000000000000000000010000000;
        int out = s.hammingWeight(n);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }
}
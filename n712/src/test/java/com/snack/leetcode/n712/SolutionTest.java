package com.snack.leetcode.n712;

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
    public void minimumDeleteSum() {
        String s1 = "sea";
        String s2 = "eat";
        int out = s.minimumDeleteSum(s1, s2);
        int expert = 231;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minimumDeleteSum2() {
        String s1 = "delete";
        String s2 = "leet";
        int out = s.minimumDeleteSum(s1, s2);
        int expert = 403;
        Assert.assertEquals(expert, out);
    }
}
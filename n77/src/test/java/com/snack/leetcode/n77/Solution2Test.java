package com.snack.leetcode.n77;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void combine() {
        int n = 4;
        int k = 2;
        List<List<Integer>> out = s.combine(n, k);
        int expert = 6;
        Assert.assertEquals(expert, out.size());
    }
}
package com.snack.leetcode.n77;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
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
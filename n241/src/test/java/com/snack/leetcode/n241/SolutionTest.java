package com.snack.leetcode.n241;

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
    public void diffWaysToCompute() {
        List<Integer> out = s.diffWaysToCompute("2-1-1");
        Integer[] expected = {0, 2};
        Assert.assertArrayEquals(expected, out.toArray());
    }

    @Test
    public void diffWaysToCompute2() {
        List<Integer> out = s.diffWaysToCompute("2*3-4*5");
        Integer[] expected = {-34, -14, -10, -10, 10};
        Assert.assertArrayEquals(expected, out.toArray());
    }
}
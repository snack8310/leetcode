package com.snack.leetcode.n278;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void firstBadVersion() {
        Solution solution = new Solution(4);
        int out = solution.firstBadVersion(10);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }
}
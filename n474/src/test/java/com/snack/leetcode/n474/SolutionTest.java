package com.snack.leetcode.n474;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void findMaxForm() {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        int out = solution.findMaxForm(strs, m, n);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaxForm2() {
        String[] strs = {"10", "0", "1"};
        int m = 1;
        int n = 1;
        int out = solution.findMaxForm(strs, m, n);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}
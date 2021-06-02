package com.snack.leetcode.n9;

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
    public void isPalindrome() {
        int x = 121;
        boolean out = solution.isPalindrome(x);
        Assert.assertTrue(out);
    }

    @Test
    public void isPalindrome2() {
        int x = -121;
        boolean out = solution.isPalindrome(x);
        Assert.assertFalse(out);
    }

    @Test
    public void isPalindrome3() {
        int x = 10;
        boolean out = solution.isPalindrome(x);
        Assert.assertFalse(out);
    }

    @Test
    public void isPalindrome4() {
        int x = -101;
        boolean out = solution.isPalindrome(x);
        Assert.assertFalse(out);
    }

}
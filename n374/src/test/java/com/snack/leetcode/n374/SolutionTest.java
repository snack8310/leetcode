package com.snack.leetcode.n374;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void guessNumber() {
        Solution solution = new Solution(6);
        int out = solution.guessNumber(10);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void guessNumber2() {
        Solution solution = new Solution(1);
        int out = solution.guessNumber(1);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void guessNumber3() {
        Solution solution = new Solution(1);
        int out = solution.guessNumber(2);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void guessNumber4() {
        Solution solution = new Solution(2);
        int out = solution.guessNumber(2);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void guessNumber5() {
        Solution solution = new Solution(6);
        int out = solution.guessNumber(10);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }
}
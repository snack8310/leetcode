package com.snack.leetcode.n59;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void generateMatrix() {
        int n = 3;
        int[][] out = s.generateMatrix(n);
        int[][] expert = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void generateMatrix2() {
        int n = 1;
        int[][] out = s.generateMatrix(n);
        int[][] expert = {{1}};
        Assert.assertArrayEquals(expert, out);
    }
}
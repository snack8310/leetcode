package com.snack.leetcode.n51;

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
    public void solveNQueens() {
        int n = 4;
        List<List<String>> out = s.solveNQueens(n);
        int expert = 2;
        Assert.assertEquals(expert, out.size());
    }

    @Test
    public void solveNQueens2() {
        int n = 1;
        List<List<String>> out = s.solveNQueens(n);
        int expert = 1;
        Assert.assertEquals(expert, out.size());
    }
}
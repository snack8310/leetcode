package com.snack.leetcode.n54;

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
    public void spiralOrder() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> rtn = s.spiralOrder(matrix);
        Integer[] out = rtn.toArray(new Integer[rtn.size()]);
        Integer[] expert = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void spiralOrder2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> rtn = s.spiralOrder(matrix);
        Integer[] out = rtn.toArray(new Integer[rtn.size()]);
        Integer[] expert = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        Assert.assertArrayEquals(expert, out);
    }
}
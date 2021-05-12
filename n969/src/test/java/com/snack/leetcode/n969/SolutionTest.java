package com.snack.leetcode.n969;

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
    public void pancakeSort() {
        int[] arr = {3, 2, 4, 1};
        List<Integer> out = s.pancakeSort(arr);
//        Integer[] expected = {4, 2, 4, 3};
        Integer[] expected = {3, 4, 2, 3, 2};
        Assert.assertArrayEquals(expected, out.toArray());
    }

    @Test
    public void pancakeSort2() {
        int[] arr = {1, 2, 3};
        List<Integer> out = s.pancakeSort(arr);
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, out.toArray());
    }
}
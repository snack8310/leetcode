package com.snack.leetcode.n90;

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
    public void subsetsWithDup() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> out = s.subsetsWithDup(nums);
        Assert.assertEquals(6, out.size());
    }

}
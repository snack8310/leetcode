package com.snack.leetcode.n448;

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
    public void findDisappearedNumbers() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> out = s.findDisappearedNumbers(nums);
        int expert = 2;
        Assert.assertEquals(expert, out.size());
    }
}
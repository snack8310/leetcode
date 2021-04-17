package com.snack.leetcode.n220;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void containsNearbyAlmostDuplicate() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        int t = 0;
        boolean out = s.containsNearbyAlmostDuplicate(nums, k, t);
        Assert.assertTrue(out);
    }

    @Test
    public void containsNearbyAlmostDuplicate2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        int t = 2;
        boolean out = s.containsNearbyAlmostDuplicate(nums, k, t);
        Assert.assertTrue(out);
    }

    @Test
    public void containsNearbyAlmostDuplicate3() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int k = 2;
        int t = 3;
        boolean out = s.containsNearbyAlmostDuplicate(nums, k, t);
        Assert.assertFalse(out);
    }
}
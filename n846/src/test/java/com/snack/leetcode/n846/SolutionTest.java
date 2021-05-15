package com.snack.leetcode.n846;

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
    public void isNStraightHand() {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        boolean out = s.isNStraightHand(hand, groupSize);
        Assert.assertTrue(out);
    }

    @Test
    public void isNStraightHand2() {
        int[] hand = {1, 2, 3, 4, 5};
        int groupSize = 4;
        boolean out = s.isNStraightHand(hand, groupSize);
        Assert.assertFalse(out);
    }

    @Test
    public void isNStraightHand3() {
        int[] hand = {1, 1, 2, 2, 3, 3};
        int groupSize = 3;
        boolean out = s.isNStraightHand(hand, groupSize);
        Assert.assertTrue(out);
    }
}
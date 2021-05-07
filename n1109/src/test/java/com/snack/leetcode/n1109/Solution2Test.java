package com.snack.leetcode.n1109;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void corpFlightBookings() {
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        int[] out = s.corpFlightBookings(bookings, n);
        int[] expert = {10, 55, 45, 25, 25};
        Assert.assertArrayEquals(expert, out);
    }


    @Test
    public void corpFlightBookings2() {
        int[][] bookings = {{1, 2, 10}, {2, 2, 15}};
        int n = 2;
        int[] out = s.corpFlightBookings(bookings, n);
        int[] expert = {10, 25};
        Assert.assertArrayEquals(expert, out);
    }
}
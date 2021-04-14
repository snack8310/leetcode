package com.snack.leetcode.n452;

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
    public void findMinArrowShots() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int out = s.findMinArrowShots(points);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMinArrowShots2() {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int out = s.findMinArrowShots(points);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMinArrowShots3() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int out = s.findMinArrowShots(points);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMinArrowShots4() {
        int[][] points = {{1, 2}, {2, 3}};
        int out = s.findMinArrowShots(points);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMinArrowShots5() {
        int[][] points = {{1, 2}};
        int out = s.findMinArrowShots(points);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMinArrowShots6() {
        int[][] points = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        int out = s.findMinArrowShots(points);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

}
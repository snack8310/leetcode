package com.snack.leetcode.n554;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void leastBricks() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(new Integer[]{1, 2, 2, 1}));
        wall.add(Arrays.asList(new Integer[]{3, 1, 2}));
        wall.add(Arrays.asList(new Integer[]{1, 3, 2}));
        wall.add(Arrays.asList(new Integer[]{2, 4}));
        wall.add(Arrays.asList(new Integer[]{3, 1, 2}));
        wall.add(Arrays.asList(new Integer[]{1, 3, 1, 1}));
        int out = s.leastBricks(wall);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void leastBricks2() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(new Integer[]{1}));
        wall.add(Arrays.asList(new Integer[]{1}));
        wall.add(Arrays.asList(new Integer[]{1}));
        int out = s.leastBricks(wall);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }
}
package com.snack.leetcode.n401;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void readBinaryWatch() {
        int turnedOn = 1;
        List<String> out = solution.readBinaryWatch(turnedOn);
        String[] expected = {"0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"};
        Assert.assertArrayEquals(expected, out.toArray(new String[out.size()]));
    }

    @Test
    public void readBinaryWatch2() {
        int turnedOn = 9;
        List<String> out = solution.readBinaryWatch(turnedOn);
        String[] expected = {};
        Assert.assertArrayEquals(expected, out.toArray(new String[out.size()]));
    }
}
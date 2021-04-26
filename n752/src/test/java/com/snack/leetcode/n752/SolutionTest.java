package com.snack.leetcode.n752;

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
    public void openLock() {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        int out = s.openLock(deadends, target);
        int expert = 6;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void openLock2() {
        String[] deadends = {"8888"};
        String target = "0009";
        int out = s.openLock(deadends, target);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void openLock3() {
        String[] deadends = {"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        String target = "8888";
        int out = s.openLock(deadends, target);
        int expert = -1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void openLock4() {
        String[] deadends = {"0000"};
        String target = "8888";
        int out = s.openLock(deadends, target);
        int expert = -1;
        Assert.assertEquals(expert, out);
    }
}
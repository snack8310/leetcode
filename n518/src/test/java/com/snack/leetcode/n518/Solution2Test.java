package com.snack.leetcode.n518;

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
    public void change() {
        int amount = 5;
        int[] coins = {1, 2, 5};
        int out = s.change(amount, coins);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void change2() {
        int amount = 3;
        int[] coins = {2};
        int out = s.change(amount, coins);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void change3() {
        int amount = 10;
        int[] coins = {10};
        int out = s.change(amount, coins);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }
}
package com.snack.leetcode.n887;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution3Test {

    Solution3 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution3();
    }

    @Test
    public void superEggDrop() {
        int k = 1;
        int n = 2;
        int out = s.superEggDrop(k, n);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void superEggDrop2() {
        int k = 2;
        int n = 6;
        int out = s.superEggDrop(k, n);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void superEggDrop3() {
        int k = 3;
        int n = 14;
        int out = s.superEggDrop(k, n);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }
}
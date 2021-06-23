package com.snack.leetcode.o15;

import com.snack.leetcode.common.convert.NumberConvertUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void hammingWeight() {
        String binaryN = "00000000000000000000000000001011";
        int n = NumberConvertUtils.binary2Decimal(binaryN);
        int out = solution.hammingWeight(n);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void hammingWeight2() {
        String binaryN = "00000000000000000000000010000000";
        int n = NumberConvertUtils.binary2Decimal(binaryN);
        int out = solution.hammingWeight(n);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }


    @Test
    public void hammingWeight3() {
        String binaryN = "11111111111111111111111111111101";
        int n = NumberConvertUtils.binary2Decimal(binaryN);
        int out = solution.hammingWeight(n);
        int expected = 31;
        Assert.assertEquals(expected, out);
    }
}
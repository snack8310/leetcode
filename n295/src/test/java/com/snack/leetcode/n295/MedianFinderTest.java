package com.snack.leetcode.n295;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianFinderTest {

    MedianFinder mf;

    @Before
    public void setUp() throws Exception {
        mf = new MedianFinder();
    }

    @Test
    public void medianFinderTest1() {
        mf.addNum(1);
        mf.addNum(2);
        double out = mf.findMedian();
        double expert = 1.5;
        Assert.assertEquals(expert, out, 1);
    }

    @Test
    public void medianFinderTest2() {
        mf.addNum(1);
        mf.addNum(2);
        mf.addNum(3);
        double out = mf.findMedian();
        double expert = 2;
        Assert.assertEquals(expert, out, 1);
    }
}
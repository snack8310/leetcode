package com.snack.leetcode.n715;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeModuleTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void queryRange() {
        RangeModule obj = new RangeModule();
        obj.addRange(10, 20);
        obj.removeRange(14, 16);
        boolean out = obj.queryRange(10, 14);
        Assert.assertTrue(out);
        out = obj.queryRange(13, 15);
        Assert.assertFalse(out);
        out = obj.queryRange(16, 17);
        Assert.assertTrue(out);
    }

    //["RangeModule","addRange","queryRange","removeRange","removeRange","addRange","queryRange","addRange","queryRange","removeRange"]
    //[[},{5,8},{3,4},{5,6},{3,6},{1,3},{2,3},{4,8},{2,3},{4,9]]

    @Test
    public void queryRange2() {
        RangeModule obj = new RangeModule();
        obj.addRange(5, 8);
        boolean out = obj.queryRange(3, 4);
        Assert.assertFalse(out);
        obj.removeRange(5, 6);
        obj.removeRange(3, 6);
        obj.addRange(1, 3);
        out = obj.queryRange(2, 3);
        Assert.assertTrue(out);
        obj.addRange(4, 8);
        out = obj.queryRange(2, 3);
        Assert.assertTrue(out);
        obj.removeRange(4, 9);
    }

    @Test
    public void queryRange3() {
        RangeModule obj = new RangeModule();
        obj.addRange(10, 20);
        obj.removeRange(14, 16);
        boolean out = obj.queryRange(10, 14);
        Assert.assertTrue(out);
        out = obj.queryRange(13, 15);
        Assert.assertFalse(out);
        out = obj.queryRange(16, 17);
        Assert.assertTrue(out);
    }

    @Test
    public void queryRange4() {
        RangeModule obj = new RangeModule();
        obj.addRange(10, 20);
        boolean out = obj.queryRange(10, 14);
        Assert.assertTrue(out);
        obj.removeRange(14, 16);
        obj.addRange(10, 20);
        out = obj.queryRange(13, 15);
        Assert.assertTrue(out);
        obj.addRange(10, 20);
        out = obj.queryRange(16, 17);
        Assert.assertTrue(out);
        obj.removeRange(14, 16);
    }


    @Test
    public void queryRange5() {
        RangeModule obj = new RangeModule();
        obj.addRange(6, 8);
        obj.removeRange(7, 8);
        obj.removeRange(8, 9);
        obj.addRange(8, 9);
        obj.removeRange(1, 3);
        obj.addRange(1, 8);
        boolean out = obj.queryRange(2, 4);
        Assert.assertTrue(out);
        out = obj.queryRange(2, 9);
        Assert.assertTrue(out);
        out = obj.queryRange(4, 6);
        Assert.assertTrue(out);
    }

    //["RangeModule","addRange","addRange","addRange","queryRange","queryRange","queryRange","removeRange","queryRange"]
//[[},{10,180},{150,200},{250,500},{50,100},{180,300},{600,1000},{50,150},{50,100]]
    @Test
    public void queryRange6() {
        RangeModule obj = new RangeModule();
        obj.addRange(10, 180);
        obj.addRange(150, 200);
        obj.addRange(250, 500);
        boolean out = obj.queryRange(50, 100);
        Assert.assertTrue(out);
        out = obj.queryRange(180, 300);
        Assert.assertFalse(out);
        out = obj.queryRange(600, 1000);
        Assert.assertFalse(out);
        obj.removeRange(50, 150);
        out = obj.queryRange(50, 100);
        Assert.assertFalse(out);
    }
}
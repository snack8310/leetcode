package com.snack.leetcode.n460;

import org.junit.Assert;
import org.junit.Test;

public class LFUCacheTest {
    @Test
    public void LFUCacheTest() {
        LFUCache lFUCache = new LFUCache(2);
        lFUCache.put(1, 1);
        lFUCache.put(2, 2);
        Assert.assertEquals(1, lFUCache.get(1));
        lFUCache.put(3, 3);
        Assert.assertEquals(-1, lFUCache.get(2));
        Assert.assertEquals(3, lFUCache.get(3));
        lFUCache.put(4, 4);
        Assert.assertEquals(-1, lFUCache.get(1));
        Assert.assertEquals(3, lFUCache.get(3));
        Assert.assertEquals(4, lFUCache.get(4));
    }

    @Test
    public void LFUCacheTest2() {
        LFUCache lFUCache = new LFUCache(0);
        lFUCache.put(0, 0);
        Assert.assertEquals(-1, lFUCache.get(0));
    }

    @Test
    public void LFUCacheTest3() {
        LFUCache lFUCache = new LFUCache(1);
        lFUCache.put(2, 1);
        Assert.assertEquals(1, lFUCache.get(2));
        lFUCache.put(3, 2);
        Assert.assertEquals(-1, lFUCache.get(2));
        Assert.assertEquals(2, lFUCache.get(3));
    }

    @Test
    public void LFUCacheTest4() {
        LFUCache lFUCache = new LFUCache(3);
        lFUCache.put(2, 2);
        lFUCache.put(1, 1);
        Assert.assertEquals(2, lFUCache.get(2));
        Assert.assertEquals(1, lFUCache.get(1));
        Assert.assertEquals(2, lFUCache.get(2));
        lFUCache.put(3, 3);
        lFUCache.put(4, 4);
        Assert.assertEquals(-1, lFUCache.get(3));
        Assert.assertEquals(2, lFUCache.get(2));
        Assert.assertEquals(1, lFUCache.get(1));
        Assert.assertEquals(4, lFUCache.get(4));
    }

}
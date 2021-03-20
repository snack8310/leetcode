package com.snack.leetcode.n146;

import org.junit.Assert;
import org.junit.Test;

public class LRUCache2Test {

    @Test
    public void LRUCacheTest1() {
        LRUCache2 lRUCache = new LRUCache2(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        Assert.assertEquals(1, lRUCache.get(1));
        lRUCache.put(3, 3);
        Assert.assertEquals(-1, lRUCache.get(2));
        lRUCache.put(4, 4);
        Assert.assertEquals(-1, lRUCache.get(1));
        Assert.assertEquals(3, lRUCache.get(3));
        Assert.assertEquals(4, lRUCache.get(4));
    }

    @Test
    public void LRUCacheTest2() {
        LRUCache2 lRUCache = new LRUCache2(2);
        lRUCache.put(2, 1);
        lRUCache.put(1, 1);
        lRUCache.put(2, 3);
        lRUCache.put(4, 1);
        Assert.assertEquals(-1, lRUCache.get(1));
        Assert.assertEquals(3, lRUCache.get(2));
    }
}
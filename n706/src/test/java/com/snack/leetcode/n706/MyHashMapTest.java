package com.snack.leetcode.n706;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

    MyHashMap hashMap;
    @Before
    public void setUp() throws Exception {
        hashMap = new MyHashMap();
    }

    @Test
    public void get() {
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(2,1);
        int v = hashMap.get(2);
        Assert.assertEquals(1, v);
    }
}
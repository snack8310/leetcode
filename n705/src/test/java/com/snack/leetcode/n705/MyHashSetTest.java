package com.snack.leetcode.n705;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashSetTest {

    MyHashSet myHashSet;

    @Before
    public void setUp() throws Exception {
        myHashSet = new MyHashSet();
    }

    @Test
    public void add() {
        myHashSet.add(5);
        myHashSet.add(105);
        myHashSet.add(774);
        System.out.println(myHashSet.show());
    }

    @Test
    public void remove() {
        myHashSet.add(5);
        myHashSet.add(105);
        myHashSet.add(774);
        myHashSet.remove(5);
        System.out.println(myHashSet.show());
    }

    @Test
    public void contains() {
        myHashSet.add(5);
        myHashSet.add(105);
        myHashSet.add(774);
        Assert.assertTrue(myHashSet.contains(5));
    }


    @Test
    public void contains2() {
        myHashSet.add(5);
        myHashSet.add(105);
        myHashSet.add(774);
        Assert.assertFalse(myHashSet.contains(6));
    }
}
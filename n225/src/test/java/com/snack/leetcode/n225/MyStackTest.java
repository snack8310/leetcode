package com.snack.leetcode.n225;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    MyStack myStack;

    @Before
    public void setUp() throws Exception {
        myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
    }

    @Test
    public void MyStackTest() {
        Assert.assertEquals(2, myStack.top());
    }

    @Test
    public void MyStackTest2() {
        MyStackTest();
        Assert.assertEquals(2, myStack.pop());
    }

    @Test
    public void MyStackTest3() {
        MyStackTest2();
        Assert.assertFalse(myStack.empty());
    }
}

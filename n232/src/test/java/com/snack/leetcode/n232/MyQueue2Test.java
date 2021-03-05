package com.snack.leetcode.n232;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyQueue2Test {

    private MyQueue2 myQueue;

    @Before
    public void setUp() throws Exception {
        myQueue = new MyQueue2();
    }

    @Test
    public void push() {
        myQueue.push(1);

    }

    @Test
    public void pop() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.peek();
        int pop = myQueue.pop();
        Assert.assertEquals(1, pop);
    }

    @Test
    public void peek() {
        myQueue.push(1);
        myQueue.push(2);
        Assert.assertEquals(1, myQueue.peek());
    }

    @Test
    public void empty() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.peek();
        myQueue.pop();
        Assert.assertEquals(false, myQueue.empty());
    }
}
package com.snack.leetcode.o9;

import org.junit.Test;

public class CQueueTest {

    @Test
    public void CQueueTest1() {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        int ret = cQueue.deleteHead();
        ret = cQueue.deleteHead();
    }

    @Test
    public void CQueueTest2() {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        cQueue.appendTail(4);
        cQueue.appendTail(5);
        int ret = cQueue.deleteHead();
        ret = cQueue.deleteHead();
        ret = cQueue.deleteHead();
        ret = cQueue.deleteHead();
    }

    @Test
    public void CQueueTest3() {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        int ret = cQueue.deleteHead();
        ret = cQueue.deleteHead();
        cQueue.appendTail(4);
        cQueue.appendTail(5);
        ret = cQueue.deleteHead();
        ret = cQueue.deleteHead();
    }
}
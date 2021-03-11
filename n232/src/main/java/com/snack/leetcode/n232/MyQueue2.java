package com.snack.leetcode.n232;

import java.util.Stack;

public class MyQueue2 {

    private Stack<Integer> in;
    private Stack<Integer> out;

    /**
     * Initialize your data structure here.
     */
    public MyQueue2() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        in.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (out.size() == 0) {
            in2out();
        }
        return out.pop();
    }

    private void in2out() {
        while (in.size() != 0) {
            out.push(in.pop());
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (out.size() == 0) {
            in2out();
        }
        return out.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return out.empty() && in.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

package com.snack.leetcode.n232;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> help;
    private Stack<Integer> real;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        help = new Stack<>();
        real = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        help = new Stack<>();
        while (real.size() != 0) {
            help.push(real.pop());
        }
        help.push(x);
        real = new Stack<>();
        while (help.size() != 0) {
            real.push(help.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return real.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return real.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return real.empty();
    }


    public String toString() {
        return real.toString();
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

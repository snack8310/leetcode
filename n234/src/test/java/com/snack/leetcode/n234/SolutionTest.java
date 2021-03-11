package com.snack.leetcode.n234;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void isPalindrome() {
        int[] o = {1, 2};
        ListNode head = getListNode(o);
        Assert.assertEquals(false, s.isPalindrome(head));
    }

    @Test
    public void isPalindrome1() {
        int[] o = {1, 2, 2, 1};
        ListNode head = getListNode(o);
        Assert.assertEquals(true, s.isPalindrome(head));
    }

    @Test
    public void isPalindrome2() {
        int[] o = {1, 2, 3, 2, 1};
        ListNode head = getListNode(o);
        Assert.assertEquals(true, s.isPalindrome(head));
    }

    @Test
    public void isPalindrome3() {
        int[] o = {1, 2, 3, 4, 2, 1};
        ListNode head = getListNode(o);
        Assert.assertEquals(false, s.isPalindrome(head));
    }

    private ListNode getListNode(int[] o) {
        ListNode head = null;
        ListNode cur = null;
        ListNode next;
        for (int i : o) {
            if (head == null) {
                head = new ListNode(i);
                cur = head;
                continue;
            }
            next = new ListNode(i);
            cur.next = next;
            cur = next;
        }
        return head;
    }
}
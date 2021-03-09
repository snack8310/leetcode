package com.snack.leetcode.n92;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return this.reverse(head, left, right);
    }

    private ListNode reverse(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    private ListNode successor = null;

    private ListNode reverse(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverse(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    private ListNode reverse(ListNode head, int m, int n) {
        if (m == 1) {
            return reverse(head, n);
        }
        head.next = reverse(head.next, m - 1, n - 1);
        return head;
    }

}

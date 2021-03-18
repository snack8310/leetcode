package com.snack.leetcode.n92;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return reverse(head, left, right);
    }

    private ListNode temp = null;

    private ListNode reverse(ListNode head, int n) {
        if (n == 1) {
            temp = head.next;
            return head;
        }
        ListNode last = reverse(head.next, n - 1);
        head.next.next = head;
        head.next = temp;
        return last;
    }

    private ListNode reverse(ListNode head, int left, int right) {
        if (left == 1) {
            return reverse(head, right);
        }
        head.next = reverse(head.next, left - 1, right - 1);
        return head;
    }
}

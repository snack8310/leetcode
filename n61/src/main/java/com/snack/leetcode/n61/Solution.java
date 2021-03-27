package com.snack.leetcode.n61;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }
        ListNode right, left;
        right = left = head;
        int i = 0;
        while (i < k) {
            right = right.next;
            if (right == null) {
                right = head;
            }
            i++;
        }
        if (left == right) {
            return head;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        ListNode rtn = left.next;
        left.next = null;
        right.next = head;
        return rtn;
    }
}

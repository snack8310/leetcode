package com.snack.leetcode.o22;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

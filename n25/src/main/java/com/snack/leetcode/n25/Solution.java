package com.snack.leetcode.n25;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode left = head;
        ListNode right = head;
        for (int i = 0; i < k; i++) {
            if (right == null) {
                return head;
            }
            right = right.next;
        }
        ListNode nh = reverse(left, right);
        left.next = reverseKGroup(right, k);
        return nh;
    }

    private ListNode reverse(ListNode left, ListNode right) {
        ListNode pre = null;
        ListNode cur = left;
        ListNode next;
        while (cur != right) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}

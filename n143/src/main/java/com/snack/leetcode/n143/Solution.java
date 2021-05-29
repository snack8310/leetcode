package com.snack.leetcode.n143;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = findMid(head);
        ListNode l2 = mid.next;
        ListNode l1 = head;
        mid.next = null;
        l2 = reverse(l2);
        merge(l1, l2);
    }

    private void merge(ListNode l1, ListNode l2) {
        ListNode l1TN = null;
        ListNode l2TN = null;
        while (l1 != null && l2 != null) {
            l1TN = l1.next;
            l2TN = l2.next;
            l1.next = l2;
            l1 = l1TN;
            l2.next = l1;
            l2 = l2TN;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private ListNode findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

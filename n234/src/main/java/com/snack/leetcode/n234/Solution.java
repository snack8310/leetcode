package com.snack.leetcode.n234;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {

    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return traverse(head);
    }

    boolean traverse(ListNode right) {
        if (right == null) {
            return true;
        }
        boolean ret = traverse(right.next);
        //后序遍历
        ret = ret && (left.val == right.val);
        left = left.next;
        return ret;
    }
}

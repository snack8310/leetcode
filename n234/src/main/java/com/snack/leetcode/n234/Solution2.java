package com.snack.leetcode.n234;

import com.snack.leetcode.common.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        int f = 0;
        int b = nums.size() - 1;
        while (f < b) {
            if (!nums.get(f).equals(nums.get(b))) {
                return false;
            }
            f++;
            b--;
        }
        return true;
    }

}

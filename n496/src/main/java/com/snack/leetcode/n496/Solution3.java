package com.snack.leetcode.n496;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution3 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, Integer> nums2Next = findNextGreater(nums2);
        int[] rtn = new int[n];
        for (int i = 0; i < n; i++) {
            rtn[i] = nums2Next.getOrDefault(nums1[i], -1);
        }
        return rtn;
    }

    private Map<Integer, Integer> findNextGreater(int[] nums2) {
        Map<Integer, Integer> rtn = new HashMap<>();
        Deque<Integer> stack = new LinkedList<>();
        int n = nums2.length;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                rtn.put(stack.poll(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        return rtn;
    }


}

package com.snack.leetcode.n654;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution2 {

    private int[] nums;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;
        return built(0, nums.length - 1);
    }

    private TreeNode built(int left, int right) {
        if (left > right) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int cursor = -1;
        for (int i = left; i <= right; i++) {
            if (max < nums[i]) {
                max = nums[i];
                cursor = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        treeNode.left = built(left, cursor - 1);
        treeNode.right = built(cursor + 1, right);
        return treeNode;
    }


}

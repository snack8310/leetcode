package com.snack.leetcode.n654;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        TreeNode c;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            root = addNode(root, nums[i]);
        }
        return root;
    }

    private TreeNode addNode(TreeNode node, int num) {
        if (node == null) {
            node = new TreeNode(num);
            return node;
        }
        if (node.val > num) {
            node.right = addNode(node.right, num);
            return node;
        }
        TreeNode nnd = new TreeNode(num);
        nnd.left = node;
        return nnd;
    }

}

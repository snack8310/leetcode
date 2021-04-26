package com.snack.leetcode.n111;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        return preorder(root, 1, ans);
    }

    private int preorder(TreeNode root, int deep, int ans) {
        if (root.left == null && root.right == null) {
            return Math.min(deep, ans);
        }
        deep++;
        if (root.left != null) {
            ans = Math.min(preorder(root.left, deep, ans), ans);
        }
        if (root.right != null) {
            ans = Math.min(preorder(root.right, deep, ans), ans);
        }
        return ans;
    }
}

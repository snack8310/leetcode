package com.snack.leetcode.n114;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode left;
        TreeNode right;
        if (root.left != null) {
            left = root.left;
            right = root.right;
            root.left = null;
            root.right = left;
            while (left.right != null) {
                left = left.right;
            }
            left.right = right;
        }
    }

}

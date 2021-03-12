package com.snack.leetcode.n226;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode c = root.left;
        root.left = root.right;
        root.right = c;
        return root;
    }
}

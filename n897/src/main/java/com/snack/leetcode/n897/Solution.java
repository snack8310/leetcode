package com.snack.leetcode.n897;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode out = new TreeNode();
        order(root, out);
        return out.right;
    }

    void order(TreeNode root, TreeNode out) {
        if (root == null) {
            return;
        }
        order(root.left, out);
        while (out.right != null){
            out = out.right;
        }
        out.right = new TreeNode(root.val);
        order(root.right, out);
    }
}

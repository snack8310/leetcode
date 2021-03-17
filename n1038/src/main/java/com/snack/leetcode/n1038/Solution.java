package com.snack.leetcode.n1038;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {

    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }
        bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;
    }
}

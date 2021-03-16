package com.snack.leetcode.n538;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution2 {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }

}

package com.snack.leetcode.n938;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return preOrder(root, low, high);
    }

    private int preOrder(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        if (root.val >= low && root.val <= high) {
            ans += root.val;
        }
        if (root.val > low) {
            ans += preOrder(root.left, low, high);
        }
        if (root.val < high) {
            ans += preOrder(root.right, low, high);
        }

        return ans;
    }
}

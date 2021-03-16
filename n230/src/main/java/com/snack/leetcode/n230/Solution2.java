package com.snack.leetcode.n230;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.Stack;

public class Solution2 {

    private int count;
    private int rtn;

    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        findMinNum(root, k);
        return rtn;
    }

    private void findMinNum(TreeNode root, int k) {
        if (root.left != null) {
            findMinNum(root.left, k);
        }
        if (++count == k) {
            rtn = root.val;
            return;
        }
        if (root.right != null) {
            findMinNum(root.right, k);
        }

    }
}

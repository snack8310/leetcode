package com.snack.leetcode.n222;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode l = root, r = root;
        int lh = 0, rh = 0;
        while (l != null) {
            l = l.left;
            lh++;
        }
        while (r != null) {
            r = r.right;
            rh++;
        }
        if (lh == rh) {
            return (int) Math.pow(2, lh) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}

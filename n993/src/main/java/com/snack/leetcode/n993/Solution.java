package com.snack.leetcode.n993;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {
    TreeNode xP = null;
    TreeNode yP = null;
    int xLevel = 0;
    int yLevel = 0;
    boolean findX = false;
    boolean findY = false;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, 0, null, x, y);
        if (xLevel == yLevel && xP != null && yP != null && xP.val != yP.val) {
            return true;
        }
        return false;
    }

    private void dfs(TreeNode node, int index, TreeNode parent, int x, int y) {
        if (findX && findY) {
            return;
        }
        if (node == null) {
            return;
        }
        if (node.val == x) {
            xP = parent;
            xLevel = index;
            findX = true;
        }
        if (node.val == y) {
            yP = parent;
            yLevel = index;
            findY = true;
        }
        dfs(node.left, index + 1, node, x, y);
        dfs(node.right, index + 1, node, x, y);
    }
}

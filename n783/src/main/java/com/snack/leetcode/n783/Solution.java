package com.snack.leetcode.n783;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {
    int pre;
    int ans;

    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return 0;
        }
        pre = -1;
        ans = Integer.MAX_VALUE;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}

package com.snack.leetcode.n530;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {

    private int pre;
    private int ans;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        ans = Integer.MAX_VALUE;
        pre = -1;
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

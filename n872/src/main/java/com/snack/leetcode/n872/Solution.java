package com.snack.leetcode.n872;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Integer[] l1 = toLeaves(root1);
        Integer[] l2 = toLeaves(root2);
        return isEquals(l1, l2);
    }

    private boolean isEquals(Integer[] l1, Integer[] l2) {
        int n = l1.length;
        if (l2.length != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (!l1[i].equals(l2[i])) {
                return false;
            }
        }
        return true;
    }

    private Integer[] toLeaves(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        reserve(root, res);
        return res.toArray(new Integer[res.size()]);
    }

    private void reserve(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res.add(root.val);
        }
        reserve(root.left, res);
        reserve(root.right, res);
    }
}

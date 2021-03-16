package com.snack.leetcode.n538;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public TreeNode convertBST(TreeNode root) {
        List<Integer> vals = new LinkedList<>();

        getFromInorder(root, vals);

        convertVal(vals);

        setToInorder(root, vals);

        return root;
    }

    private void convertVal(List<Integer> vals) {
        for (int i = vals.size() - 2; i >= 0; i--) {
            vals.set(i, vals.get(i) + vals.get(i + 1));
        }
    }

    private void getFromInorder(TreeNode root, List<Integer> vals) {
        if (root == null) {
            return;
        }
        getFromInorder(root.left, vals);
        vals.add(root.val);
        getFromInorder(root.right, vals);
    }

    private void setToInorder(TreeNode root, List<Integer> vals) {
        if (root == null) {
            return;
        }
        setToInorder(root.left, vals);
        root.val = vals.get(0);
        vals.remove(0);
        setToInorder(root.right, vals);
    }
}

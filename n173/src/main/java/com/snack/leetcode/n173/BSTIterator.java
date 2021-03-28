package com.snack.leetcode.n173;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {

    private int idx;
    private List<Integer> ars;

    public BSTIterator(TreeNode root) {
        idx = 0;
        ars = new ArrayList<>();
        init(root);
    }

    private void init(TreeNode root) {
        if (root == null) {
            return;
        }
        init(root.left);
        ars.add(root.val);
        init(root.right);
    }

    public int next() {
        return ars.get(idx++);
    }

    public boolean hasNext() {
        return idx < ars.size();
    }
}

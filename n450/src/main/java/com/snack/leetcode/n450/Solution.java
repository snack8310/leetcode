package com.snack.leetcode.n450;

import com.snack.leetcode.common.treenode.TreeNode;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int val = min(root.right);
                root.val = val;
                root.right = deleteNode(root.right, val);
                return root;
            }
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            root.left = deleteNode(root.left, key);
        }

        return root;
    }

    private int min(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }
}

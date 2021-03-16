package com.snack.leetcode.n230;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.Stack;

public class Solution {

    private Stack<Integer> stack;

    public int kthSmallest(TreeNode root, int k) {
        stack = new Stack<>();
        findMinNum(root, k);
        return stack.peek();
    }

    private void findMinNum(TreeNode root, int k) {
        if (root.left != null) {
            findMinNum(root.left, k);
        }
        if (stack.size() == k) {
            return;
        }
        stack.push(root.val);
        if (root.right != null) {
            findMinNum(root.right, k);
        }

    }
}

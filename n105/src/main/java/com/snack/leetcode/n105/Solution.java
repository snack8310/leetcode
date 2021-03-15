package com.snack.leetcode.n105;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int root = preorder[0];
        int n = inorder.length;

        int index = 0;
        while (true) {
            if (root == inorder[index]) {
                break;
            }
            index++;
        }
        int[] left_inorder = Arrays.copyOfRange(inorder, 0, index);
        int[] right_inorder = Arrays.copyOfRange(inorder, index + 1, n);

        int[] left_preorder = Arrays.copyOfRange(preorder, 1, index + 1);
        int[] right_preorder = Arrays.copyOfRange(preorder, index + 1, n);

        TreeNode treeNode = new TreeNode(root);
        if (left_preorder != null && left_preorder.length != 0) {
            treeNode.left = buildTree(left_preorder, left_inorder);
        }
        if (right_preorder != null && right_preorder.length != 0) {
            treeNode.right = buildTree(right_preorder, right_inorder);
        }
        return treeNode;
    }

}

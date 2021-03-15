package com.snack.leetcode.n105;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int n = inorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }

        return reserve(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode reserve(int[] preorder, int[] inorder, int p_from, int p_to, int i_from, int i_to) {
        int root = preorder[p_from];
        int index = indexMap.get(root);

        TreeNode treeNode = new TreeNode(root);
        int left_length = index - i_from;
        if (index - i_from > 0) {
            treeNode.left = reserve(preorder, inorder, p_from + 1, p_from + left_length, i_from, i_from + left_length - 1);
        }
        if (left_length < i_to - i_from) {
            treeNode.right = reserve(preorder, inorder, p_from + 1 + left_length, p_to, i_from + left_length + 1, i_to);
        }
        return treeNode;
    }

}

package com.snack.leetcode.n106;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }

        return reserve(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode reserve(int[] inorder, int[] postorder, int i_from, int i_to, int p_from, int p_to) {
        int root = postorder[p_to];
        int index = indexMap.get(root);

        TreeNode treeNode = new TreeNode(root);
        int left_length = index - i_from;
        if (index - i_from > 0) {
            treeNode.left = reserve(inorder, postorder, i_from, i_from + left_length - 1, p_from, p_from + left_length - 1);
        }
        if (left_length < i_to - i_from) {
            treeNode.right = reserve(inorder, postorder, i_from + left_length + 1, i_to, p_from + left_length, p_to - 1);
        }
        return treeNode;
    }
}

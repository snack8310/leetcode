package com.snack.leetcode.n652;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.*;

public class Solution {
    private Map<String, Integer> preoderMap;
    private List<TreeNode> repeatTreeNode;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        preoderMap = new HashMap<>();
        repeatTreeNode = new ArrayList<>();
        reverse(root);
        return repeatTreeNode;
    }

    private String reverse(TreeNode node) {
        if (node == null) {
            return "#";
        }
        String rtn = node.val + "," + reverse(node.left) + "," + reverse(node.right);

        preoderMap.put(rtn, preoderMap.getOrDefault(rtn, 0) + 1);
        if (preoderMap.get(rtn) == 2) {
            repeatTreeNode.add(node);
        }
        return rtn;
    }
}

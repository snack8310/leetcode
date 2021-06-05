package com.snack.leetcode.n103;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        List<TreeNode> lastLevelNodes = new ArrayList<>();
        lastLevelNodes.add(root);
        while (lastLevelNodes.size() != 0) {
            List<Integer> lastLevelValues = new ArrayList<>();
            for (int i = 0; i < lastLevelNodes.size(); i++) {
                lastLevelValues.add(lastLevelNodes.get(i).val);
            }
            ans.add(lastLevelValues);
            List<TreeNode> nextLevelNodes = new ArrayList<>();
            for (int i = lastLevelNodes.size() - 1; i >= 0; i--) {
                TreeNode left = lastLevelNodes.get(i).left;
                TreeNode right = lastLevelNodes.get(i).right;
                if (ans.size() % 2 == 0) {
                    if (left != null) {
                        nextLevelNodes.add(left);
                    }
                    if (right != null) {
                        nextLevelNodes.add(right);
                    }
                } else {
                    if (right != null) {
                        nextLevelNodes.add(right);
                    }
                    if (left != null) {
                        nextLevelNodes.add(left);
                    }
                }
            }
            lastLevelNodes = nextLevelNodes;
        }
        return ans;
    }

}

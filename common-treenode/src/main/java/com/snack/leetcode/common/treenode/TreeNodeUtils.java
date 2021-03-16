package com.snack.leetcode.common.treenode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TreeNodeUtils {
    public static TreeNode createTreeNodeFromLevelOrder(Integer[] os) {
        if (os == null || os.length == 0) {
            return null;
        }
        List<TreeNode> pLevels = new LinkedList<>();
        TreeNode root = new TreeNode(os[0]);
        pLevels.add(root);
        Integer[] nos = Arrays.copyOfRange(os, 1, os.length);
        reserve(pLevels, nos);
        return root;
    }

    private static void reserve(List<TreeNode> pLevels, Integer[] os) {
        if (pLevels == null || pLevels.size() == 0 || os.length == 0) {
            return;
        }
        int i = 0;
        int n = os.length;
        List<TreeNode> npLevels = new LinkedList<>();
        for (TreeNode treeNode : pLevels) {
            if (treeNode == null) {
                continue;
            }
            if (i >= n) {
                break;
            }
            TreeNode left = null;
            if (os[i] != null) {
                left = new TreeNode(os[i]);
                npLevels.add(left);
            }
            treeNode.left = left;
            i++;
            if (i >= n) {
                break;
            }
            TreeNode right = null;
            if (os[i] != null) {
                right = new TreeNode(os[i]);
                npLevels.add(right);
            }
            treeNode.right = right;
            i++;
        }
        Integer[] nos = Arrays.copyOfRange(os, i, os.length);
        reserve(npLevels, nos);
    }

    public static Integer[] createLevelOrderArrayFrom(TreeNode root) {
        List<Integer> os = new LinkedList<>();
        List<TreeNode> pLevels = new LinkedList<>();
        if (root != null) {
            pLevels.add(root);
            reserve(pLevels, os);
        }
        return os.toArray(new Integer[os.size()]);
    }

    private static void reserve(List<TreeNode> pLevels, List<Integer> os) {
        if (pLevels == null || pLevels.size() == 0) {
            return;
        }
        List<TreeNode> npLevels = new LinkedList<>();
        for (TreeNode treeNode : pLevels) {
            if (treeNode == null) {
                os.add(null);
                continue;
            }
            os.add(treeNode.val);
            if (treeNode.left == null && treeNode.right == null) {
                continue;
            }
            npLevels.add(treeNode.left);
            npLevels.add(treeNode.right);
        }
        reserve(npLevels, os);
    }
}

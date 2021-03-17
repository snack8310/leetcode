package com.snack.leetcode.n297;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serialize(root, "");
    }

    public String serialize(TreeNode root, String val) {
        if (root == null) {
            val += "None" + ",";
        } else {
            val += root.val + ",";
            val = serialize(root.left, val);
            val = serialize(root.right, val);
        }
        return val;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] array = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(array));
        return deserialize(list);
    }

    private TreeNode deserialize(List<String> list) {
        String val = list.get(0);
        if ("None".equals(val)) {
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(val));
        list.remove(0);
        root.left = deserialize(list);
        root.right = deserialize(list);
        return root;
    }
}

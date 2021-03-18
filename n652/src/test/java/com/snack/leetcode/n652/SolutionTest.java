package com.snack.leetcode.n652;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void findDuplicateSubtrees() {
        Integer[] os = new Integer[]{1, 2, 3, 4, null, 2, 4, null, null, 4, null};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        List<TreeNode> out = s.findDuplicateSubtrees(root);
        Assert.assertEquals(2, out.size());
        Integer[] rowOut = TreeNodeUtils.createLevelOrderArrayFrom(out.get(0));
        Assert.assertArrayEquals(new Integer[]{4}, rowOut);
        rowOut = TreeNodeUtils.createLevelOrderArrayFrom(out.get(1));
        Assert.assertArrayEquals(new Integer[]{2, 4, null}, rowOut);
    }

    @Test
    public void findDuplicateSubtrees2() {
        Integer[] os = new Integer[]{0, 0, 0, 0, null, null, 0, null, null, null, 0};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        List<TreeNode> out = s.findDuplicateSubtrees(root);
        Assert.assertEquals(1, out.size());
        Integer[] rowOut = TreeNodeUtils.createLevelOrderArrayFrom(out.get(0));
        Assert.assertArrayEquals(new Integer[]{0}, rowOut);
    }

    @Test
    public void findDuplicateSubtrees3() {
        Integer[] os = new Integer[]{2,1,11,11,null,1};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        List<TreeNode> out = s.findDuplicateSubtrees(root);
        Assert.assertEquals(0, out.size());
    }
}
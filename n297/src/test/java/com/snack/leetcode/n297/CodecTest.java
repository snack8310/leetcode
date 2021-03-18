package com.snack.leetcode.n297;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CodecTest {

    Codec ser;
    Codec deser;

    @Before
    public void setUp() throws Exception {
        ser = new Codec();
        deser = new Codec();
    }

    @Test
    public void serialize() {
        Integer[] input = {1, 2, 3, null, null, 4, 5};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(input);
        TreeNode ans = deser.deserialize(ser.serialize(root));
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(ans);
        Assert.assertArrayEquals(input, out);
    }
}
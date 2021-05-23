package om.snack.leetcode.o3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void findRepeatNumber() {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int out = s.findRepeatNumber(nums);
        doAssert(out, new int[]{2, 3});
    }

    private void doAssert(int out, int[] expected) {
        for (int e : expected) {
            if (out == e) {
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.assertTrue(false);
    }
}
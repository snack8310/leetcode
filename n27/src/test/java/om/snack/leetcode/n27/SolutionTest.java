package om.snack.leetcode.n27;

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
    public void removeElement() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int out = s.removeElement(nums, val);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void removeElement2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int out = s.removeElement(nums, val);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }
}
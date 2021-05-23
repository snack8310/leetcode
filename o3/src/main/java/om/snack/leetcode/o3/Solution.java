package om.snack.leetcode.o3;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[nums[i] % n] += n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 2 * n) {
                return i;
            }
        }
        return -1;
    }
}

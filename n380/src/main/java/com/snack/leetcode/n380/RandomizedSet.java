package com.snack.leetcode.n380;

import java.util.*;

public class RandomizedSet {

    List<Integer> nums;
    Map<Integer, Integer> num2idx;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        nums = new ArrayList<>();
        num2idx = new HashMap<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (num2idx.containsKey(val)) {
            return false;
        }
        num2idx.put(val, nums.size());
        nums.add(nums.size(), val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!num2idx.containsKey(val)) {
            return false;
        }
        Integer idx = num2idx.get(val);
        Integer lastNum = nums.get(nums.size() - 1);
        nums.set(idx, lastNum);
        num2idx.put(lastNum, idx);
        nums.remove(nums.size() - 1);
        num2idx.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Random rand = new Random();
        return nums.get(rand.nextInt(nums.size()));
    }
}

package com.snack.leetcode.n969;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> ret = new ArrayList<>();

    public List<Integer> pancakeSort(int[] arr) {
        int n = arr.length;
        sort(arr, n);
        return ret;
    }

    private void sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        int maxIndex = getMaxIndexFrom(arr, n);
        if (maxIndex != n - 1) {
            if (maxIndex > 0) {
                reverse(arr, 0, maxIndex);
                ret.add(maxIndex + 1);
            }
            reverse(arr, 0, n - 1);
            ret.add(n);
        }
        sort(arr, n - 1);
    }

    private int getMaxIndexFrom(int[] arr, int n) {
        int maxVal = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}

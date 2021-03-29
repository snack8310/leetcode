package com.snack.leetcode.n710;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {

    int sz;
    Map<Integer, Integer> blackMapping;
    Random r = new Random();

    public Solution(int N, int[] blacklist) {
        sz = N - blacklist.length;
        blackMapping = new HashMap<>();
        for (int b : blacklist) {
            blackMapping.put(b, b);
        }
        int m = sz;
        for (int b : blacklist) {
            if (b >= sz) {
                continue;
            }
            while (blackMapping.containsKey(m)) {
                m++;
            }
            blackMapping.put(b, m);
            m++;
        }
    }

    public int pick() {
        int ret = r.nextInt(sz);
        return blackMapping.containsKey(ret) ? blackMapping.get(ret) : ret;
    }
}

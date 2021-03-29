package com.snack.leetcode.n710;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void pick() {
        int N = 1;
        int[] blacklist = {};
        Solution s = new Solution(N, blacklist);
        int[] expert = {0};
        List<Integer> out = new ArrayList<>();
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        Assert.assertTrue(valid(out, expert));
    }

    @Test
    public void pick2() {
        int N = 2;
        int[] blacklist = {};
        Solution s = new Solution(N, blacklist);
        int[] expert = {0, 1};
        List<Integer> out = new ArrayList<>();
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        Assert.assertTrue(valid(out, expert));
    }

    @Test
    public void pick3() {
        int N = 3;
        int[] blacklist = {1};
        Solution s = new Solution(N, blacklist);
        int[] expert = {0, 2};
        List<Integer> out = new ArrayList<>();
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        Assert.assertTrue(valid(out, expert));
    }

    @Test
    public void pick4() {
        int N = 4;
        int[] blacklist = {0, 1};
        Solution s = new Solution(N, blacklist);
        int[] expert = {2, 3};
        List<Integer> out = new ArrayList<>();
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        out.add(s.pick());
        Assert.assertTrue(valid(out, expert));
    }

    private boolean valid(List<Integer> out, int[] expert) {
        Map<Integer, Integer> ee = new HashMap<>();
        for (int i : out) {
            ee.put(i, ee.getOrDefault(i, 0) + 1);
        }
        for (int i : expert) {
            if (!ee.containsKey(i) || ee.get(i) == 0) {
                return false;
            }
        }
        return true;
    }
}
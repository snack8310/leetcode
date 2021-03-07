package com.snack.leetcode.n131;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution2Test {


    private Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void partition() {
        String o = "aab";
        List<List<String>> p = s.partition(o);
        for (List<String> sp : p) {
            System.out.println(sp.toString());
        }
    }

    @Test
    public void partition2() {
        String o = "aabccbaa";
        List<List<String>> p = s.partition(o);
        for (List<String> sp : p) {
            System.out.println(sp.toString());
        }
    }
}
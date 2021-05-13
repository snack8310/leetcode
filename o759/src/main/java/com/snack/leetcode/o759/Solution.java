package com.snack.leetcode.o759;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<int[]> times = new ArrayList<>();
        for (List<Interval> intervals : schedule) {
            for (Interval interval : intervals) {
                times.add(new int[]{interval.start, 1});
                times.add(new int[]{interval.end, -1});
            }
        }
        Collections.sort(times, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        List<Interval> ans = new ArrayList<>();
        int last = -1;
        int bal = 0;
        for (int[] time : times) {
            if (bal == 0 && last >= 0 && time[0] != last) {
                ans.add(new Interval(last, time[0]));
            }
            bal += time[1];
            last = time[0];
        }
        return ans;
    }


}

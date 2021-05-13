package com.snack.leetcode.o759;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void employeeFreeTime() {
        List<List<Interval>> schedule = new ArrayList<>();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(5, 6));
        schedule.add(intervals);
        intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        schedule.add(intervals);
        intervals = new ArrayList<>();
        intervals.add(new Interval(4, 10));
        schedule.add(intervals);
        List<Interval> out = s.employeeFreeTime(schedule);
    }

    @Test
    public void employeeFreeTime2() {
        List<List<Interval>> schedule = new ArrayList<>();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 7));
        schedule.add(intervals);
        intervals = new ArrayList<>();
        intervals.add(new Interval(2, 4));
        schedule.add(intervals);
        intervals = new ArrayList<>();
        intervals.add(new Interval(2, 5));
        intervals.add(new Interval(9, 12));
        schedule.add(intervals);
        List<Interval> out = s.employeeFreeTime(schedule);
    }

    @Test
    public void employeeFreeTime3() {
        List<List<Interval>> schedule = new ArrayList<>();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(5, 6));
        schedule.add(intervals);
        intervals = new ArrayList<>();
        intervals.add(new Interval(1, 5));
        schedule.add(intervals);
        List<Interval> out = s.employeeFreeTime(schedule);
    }
}
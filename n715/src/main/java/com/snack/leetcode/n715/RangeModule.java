package com.snack.leetcode.n715;

import java.util.*;

public class RangeModule {
    TreeSet<Interval> ranges;

    public RangeModule() {
        ranges = new TreeSet<>();
    }

    public void addRange(int left, int right) {
        Iterator<Interval> it = ranges.tailSet(new Interval(0, left - 1)).iterator();
        while (it.hasNext()) {
            Interval range = it.next();
            if (right < range.left) break;
            left = Math.min(left, range.left);
            right = Math.max(right, range.right);
            it.remove();
        }
        ranges.add(new Interval(left, right));
    }

    public boolean queryRange(int left, int right) {
        Interval range = ranges.higher(new Interval(0, left));
        return (range != null && range.left <= left && right <= range.right);
    }

    public void removeRange(int left, int right) {
        Iterator<Interval> it = ranges.tailSet(new Interval(0, left)).iterator();
        ArrayList<Interval> todo = new ArrayList();
        while (it.hasNext()) {
            Interval range = it.next();
            if (right < range.left) break;
            if (range.left < left) todo.add(new Interval(range.left, left));
            if (right < range.right) todo.add(new Interval(right, range.right));
            it.remove();
        }
        ranges.addAll(todo);
    }
}

class Interval implements Comparable<Interval> {
    int left;
    int right;

    public Interval(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Interval o) {
        if (this.right == o.right) return this.left - o.left;
        return this.right - o.right;
    }
}

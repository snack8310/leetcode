package com.snack.leetcode.n690;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    private Employee getEmployee(int id, int importance, Integer[] subordinates) {
        return new Employee(id, importance, Arrays.asList(subordinates));
    }

    @Test
    public void getImportance() {
        List<Employee> employees = new ArrayList<>();
        employees.add(getEmployee(1, 5, new Integer[]{2, 3}));
        employees.add(getEmployee(2, 3, new Integer[]{}));
        employees.add(getEmployee(3, 3, new Integer[]{}));
        int id = 1;
        int out = s.getImportance(employees, id);
        int expert = 11;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void getImportance2() {
        List<Employee> employees = new ArrayList<>();
        employees.add(getEmployee(1, 5, new Integer[]{2, 3}));
        employees.add(getEmployee(2, 3, new Integer[]{}));
        employees.add(getEmployee(3, 3, new Integer[]{}));
        int id = 4;
        int out = s.getImportance(employees, id);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}
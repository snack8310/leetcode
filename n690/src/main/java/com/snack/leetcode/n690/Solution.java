package com.snack.leetcode.n690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeesMap = new HashMap<>();
        for (Employee employee : employees) {
            employeesMap.put(employee.id, employee);
        }
        return dfs(employeesMap, id);
    }

    private int dfs(Map<Integer, Employee> employeesMap, int id) {
        if (!employeesMap.containsKey(id)) {
            return 0;
        }
        int ret = 0;
        Employee employee = employeesMap.get(id);
        ret += employee.importance;
        for (Integer sId : employee.subordinates) {
            ret += dfs(employeesMap, sId);
        }
        return ret;
    }
}

package com.snack.leetcode.n1600;

import java.util.*;

public class ThroneInheritance {

    Map<String, List<String>> edges;
    Set<String> dead;
    String king;

    public ThroneInheritance(String kingName) {
        edges = new HashMap<>();
        dead = new HashSet<>();
        king = kingName;
    }

    public void birth(String parentName, String childName) {
        List<String> children = edges.getOrDefault(parentName, new ArrayList<>());
        children.add(childName);
        edges.put(parentName, children);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> ans = new ArrayList<>();
        preorder(ans, king);
        return ans;
    }

    private void preorder(List<String> ans, String name) {
        if (!dead.contains(name)) {
            ans.add(name);
        }
        List<String> children = edges.getOrDefault(name, new ArrayList<>());
        for (String childName : children) {
            preorder(ans, childName);
        }
    }
}

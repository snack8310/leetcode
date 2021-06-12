package com.snack.leetcode.n811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainVisits = new HashMap<>();
        for (String cpd : cpdomains) {
            String[] cs = cpd.split(" ");
            if (cs.length != 2) {
                continue;
            }
            String fdomain = cs[1];
            String[] subDomains = fdomain.split("\\.");
            for (int i = 0; i < subDomains.length; i++) {
                StringBuilder sb = new StringBuilder(subDomains[i]);
                for (int j = i + 1; j < subDomains.length; j++) {
                    sb.append(".");
                    sb.append(subDomains[j]);
                }
                domainVisits.put(sb.toString(), domainVisits.getOrDefault(sb.toString(), 0) + Integer.valueOf(cs[0]));
            }
        }
        List<String> ret = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : domainVisits.entrySet()) {
            String s = entry.getValue() + " " + entry.getKey();
            ret.add(s);
        }
        return ret;
    }
}

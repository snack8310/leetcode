package com.snack.leetcode.n990;

public class Solution {

    public boolean equationsPossible(String[] equations) {
        UF uf = new UF(26);
        for (String eq : equations) {
            if (eq.charAt(1) == '=') {
                char p = eq.charAt(0);
                char q = eq.charAt(3);
                uf.union(p - 'a', q - 'a');
            }
        }

        for (String eq : equations) {
            if (eq.charAt(1) == '!') {
                char p = eq.charAt(0);
                char q = eq.charAt(3);
                if (uf.connected(p - 'a', q - 'a')) {
                    return false;
                }
            }
        }
        return true;
    }


}

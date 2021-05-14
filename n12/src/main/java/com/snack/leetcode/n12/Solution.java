package com.snack.leetcode.n12;

public class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int n = num / 1000;
        for (int i = 0; i < n; i++) {
            sb.append("M");
        }
        n = (num % 1000) / 100;
        for (int i = 0; i < n; i++) {
            sb.append("C");
        }
        n = (num % 100) / 10;
        for (int i = 0; i < n; i++) {
            sb.append("X");
        }
        n = num % 10;
        for (int i = 0; i < n; i++) {
            sb.append("I");
        }
        String ans = sb.toString();
        ans = ans.replaceAll("CCCCCCCCC", "CM");
        ans = ans.replaceAll("CCCCC", "D");
        ans = ans.replaceAll("CCCC", "CD");
        ans = ans.replaceAll("XXXXXXXXX", "XC");
        ans = ans.replaceAll("XXXXX", "L");
        ans = ans.replaceAll("XXXX", "XL");
        ans = ans.replaceAll("IIIIIIIII", "IX");
        ans = ans.replaceAll("IIIII", "V");
        ans = ans.replaceAll("IIII", "IV");
        return ans;
    }
}

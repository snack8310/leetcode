package com.snack.leetcode.n1109;

public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int first = bookings[i][0] - 1;
            int last = bookings[i][1] - 1;
            for (int j = first; j <= last; j++) {
                answer[j] += bookings[i][2];
            }
        }
        return answer;
    }
}

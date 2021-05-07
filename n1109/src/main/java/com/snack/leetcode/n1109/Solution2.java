package com.snack.leetcode.n1109;

public class Solution2 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            answer[bookings[i][0] - 1] += bookings[i][2];
            if (bookings[i][1] < n) {
                answer[bookings[i][1]] -= bookings[i][2];
            }
        }
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }
        return answer;
    }
}

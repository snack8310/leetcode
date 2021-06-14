package com.snack.leetcode.n374;

public class GuessGame {
    int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    int guess(int num) {
        if (pick > num) {
            return 1;
        } else if (pick < num) {
            return -1;
        } else {
            return 0;
        }
    }
}

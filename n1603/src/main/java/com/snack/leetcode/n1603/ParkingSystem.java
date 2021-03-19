package com.snack.leetcode.n1603;

public class ParkingSystem {

    private int bigPark;
    private int mediumPark;
    private int smallPark;

    public ParkingSystem(int big, int medium, int small) {
        bigPark = big;
        mediumPark = medium;
        smallPark = small;

    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (bigPark > 0) {
                bigPark--;
                return true;
            }
            return false;
        } else if (carType == 2) {
            if (mediumPark > 0) {
                mediumPark--;
                return true;
            }
            return false;
        } else if (carType == 3) {
            if (smallPark > 0) {
                smallPark--;
                return true;
            }
            return false;
        }
        return false;
    }
}

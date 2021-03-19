package com.snack.leetcode.n1603;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingSystemTest {

    ParkingSystem ps;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addCar() {
        ps = new ParkingSystem(1, 1, 0);
        Assert.assertTrue(ps.addCar(1));
        Assert.assertTrue(ps.addCar(2));
        Assert.assertFalse(ps.addCar(3));
        Assert.assertFalse(ps.addCar(1));

    }
}
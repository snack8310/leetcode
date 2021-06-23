package com.snack.leetcode.common.convert;

public class NumberConvertUtils {

    /**
     * 二进制转十进制
     *
     * @param number
     * @return
     */
    public static int binary2Decimal(String number) {
        return scale2Decimal(number, 2);
    }

    /**
     * 其他进制转十进制
     *
     * @param number
     * @return
     */
    public static int scale2Decimal(String number, int scale) {
        checkNumber(number);
        if (2 > scale || scale > 32) {
            throw new IllegalArgumentException("scale is not in range");
        }
        // 不同其他进制转十进制,修改这里即可
        int total = 0;
        String[] ch = number.split("");
        int chLength = ch.length;
        for (int i = 0; i < chLength; i++) {
            total += Integer.valueOf(ch[i]) * Math.pow(scale, chLength - 1 - i);
        }
        return total;

    }

    /**
     * 十进制转二进制
     *
     * @param number
     * @return
     */
    public static String decimal2Binary(int number) {
        return decimal2Scale(number, 2);
    }

    /**
     * 十进制转其他进制
     *
     * @param number
     * @param scale
     * @return
     */
    public static String decimal2Scale(int number, int scale) {
        if (2 > scale || scale > 32) {
            throw new IllegalArgumentException("scale is not in range");
        }
        String result = "";
        while (0 != number) {
            result = number % scale + result;
            number = number / scale;
        }

        return result;
    }

    public static void checkNumber(String number) {
        String regexp = "^\\d+$";
        if (null == number || !number.matches(regexp)) {
            throw new IllegalArgumentException("input is not a number");
        }
    }
}

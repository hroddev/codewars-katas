package com.hroddev.katas;

/*
 * Code as fast as you can! You need to double the integer and return it.
 */
public class DoubleInteger {
    public static int doubleInteger(int i) {
        // Double the integer and return it!

        return i + i;

    }

    public static void main(String[] args) {
        var number = doubleInteger(388);
        System.out.println(number);
    }
}

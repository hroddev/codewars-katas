package com.hroddev.katas;

import java.util.Arrays;

/*
 * Square(n) Sum - Complete the square sum function so that it squares each number passed into it
 * and then sums the results together.
 * 
 */

public class SquareSum {
    public static int squareSumWithLoop(int[] n) {
        // initialice a variable in zero
        int sum = 0;

        // iterate the array, make the square of the number and acumulate the res in sum variable
        for (int i : n) {
            sum += i * i;
        }
        return sum;
    }

    public static int squareSumWithStream(int[] n) {
        // use the map for make a operation of multiplication and use reduce for sum the result
        return Arrays.stream(n).map(i -> i * i).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        var method1 = squareSumWithLoop(new int[] {1, 2, 2});
        System.out.println(method1);

        var method2 = squareSumWithStream(new int[] {1, 2, 2});
        System.out.println(method2);
    }
}

package com.hroddev.katas;

import java.util.Arrays;

/*
 * Write a function which calculates the average of the numbers in a given list. Note: Empty arrays should
 * return 0.
 */
public class CalculateAverage
{
    public double find_average(int[] array)
    {

        return Arrays.stream(array).average().orElse(0.00);
    }

    public static void main(String[] args)
    {
        int[] test1 =
        {};

        var method1 = new CalculateAverage();
        System.out.println(method1.find_average(test1));;
    }

}

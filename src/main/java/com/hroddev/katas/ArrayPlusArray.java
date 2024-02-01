package com.hroddev.katas;

import java.util.stream.IntStream;

public class ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // sum the numbers of the arrays directly
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(arrayPlusArray(arr1, arr2));
    }
}

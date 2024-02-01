package com.hroddev.katas;

import java.util.stream.IntStream;

public class ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // concatenate arr1 and arr2
        int[] bothArr = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();

        // sum number of the bothArr
        return IntStream.of(bothArr).sum();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(arrayPlusArray(arr1, arr2));
    }
}

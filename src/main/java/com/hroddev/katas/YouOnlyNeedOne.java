package com.hroddev.katas;

import java.util.Arrays;

/*
 * You will be given an array a and a value x. All you need to do is check whether the provided
 * array contains the value.
 * 
 * Array can contain numbers or strings. X can be either.
 * 
 * Return true if the array contains the value, false if not.
 * 
 */
public class YouOnlyNeedOne {

    public boolean checkWithLoop(Object[] a, Object x) {
        // Your code here
        for (Object o : a) {
            if (o.equals(x)) {
                return true;
            }
        }

        return false;
    }

    public boolean checkWithStream1(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(o -> o.equals(x));
    }

    public boolean checkWithStream2(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

    public static void main(String[] args) {
        var testObj = new YouOnlyNeedOne();
        System.out.println(testObj.checkWithLoop(new Object[] {"a", "b", "c"}, "a"));
        System.out.println(testObj.checkWithStream1(new Object[] {"a", "b", "c"}, "a"));
        System.out.println(testObj.checkWithStream2(new Object[] {"a", "b", "c"}, "a"));
    }
}

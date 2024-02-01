package com.hroddev.katas;

public class CharProblem {
    public int howOld(final String herOld) {
        var num = herOld.substring(0, 1);
        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        var demo = new CharProblem();
        System.out.println(demo.howOld("5 year old"));
    }
}

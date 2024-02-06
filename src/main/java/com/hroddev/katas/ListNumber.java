package com.hroddev.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 * Write a function which takes a list of strings and returns each line prepended by the correct number. The
 * numbering starts at 1. The format is n: string. Notice the colon and space in between. Examples: (Input -->
 * Output) [] --> [] ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */
public class ListNumber
{
    public List<String> numberWithLoop(List<String> lines)
    {
        List<String> listArr = new ArrayList<>();
        int i = 0;

        for (String line : lines)
        {
            String list = (i + 1) + ": " + line;
            listArr.add(list);
            i++;
            System.out.println(list);
        }
        return listArr;
    }

    public static void main(String[] args)
    {
        List<String> listTest = Arrays.asList("a", "b", "c");
        var method1 = new ListNumber();
        method1.numberWithLoop(listTest);
    }

}

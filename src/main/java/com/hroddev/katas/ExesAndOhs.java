package com.hroddev.katas;

public class ExesAndOhs
{

    /*
     * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be
     * case insensitive. The string can contain any char. Examples input/output: XO("ooxx") => true
     * XO("xooxx") => false XO("ooxXm") => true XO("zpzpzpp") => true (when no 'x' and 'o' is present should)
     * return true XO("zzoo") => false
     */

    public boolean getXO(String str)
    {
        // transform the string to array and lowercase
        char[] chars = str.toLowerCase().toCharArray();

        // count the number of x and o
        int countX = 0;
        int countO = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == 'x')
            {
                countX++;
            }
            if (chars[i] == 'o')
            {
                countO++;
            }
        }
        return countX == countO;

    }

    public static void main(String[] args)
    {
        var x = new ExesAndOhs();
        System.out.println(x.getXO("zzoo"));
    }

}

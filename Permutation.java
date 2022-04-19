package com.company;

import java.util.Arrays;

public class Permutation {
    public static void findLexicographic(char[] start, String end)
    {
        if (end.length() == start.length)
        {
            System.out.print(end + " ");
            return;
        }
        for (char c: start) {
            findLexicographic(start , end + c);
        }
    }
    public static void findLexicographic(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        findLexicographic(chars, "");
    }
    public static void main(String[] args)
    {
        String str = "PQR";
        findLexicographic(str);
    }
}

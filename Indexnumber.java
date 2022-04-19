package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Indexnumber {
    public static int indexnumber(int arr[], int t) {
        ArrayList<Integer> clist = new ArrayList<>();
        for (int i : arr) {
            clist.add(i);
            {
                if (arr[i] != t) {
                    t=-1;
                }
                return clist.indexOf(t);
            }}
        return t;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 8, 6, 7};
        System.out.println(indexnumber(arr, 8));
    }
}

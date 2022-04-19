package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,4,9,25,8,10);
        list.sort((i1,i2) -> i1.compareTo(i2));
        list.forEach(i -> System.out.print(i+" "));
    }
}


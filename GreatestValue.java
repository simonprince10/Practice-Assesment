package com.company;

import java.security.Key;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GreatestValue {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(1,18);
        map.put(2,20);
        map.put(3,45);
        map.put(4,8);
        map.put(5,6);
        int maxValueInMap=(Collections.max(map.values()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
            }}
        Integer min= Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(min);

        }}
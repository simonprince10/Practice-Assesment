package com.company;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,3,5,5,6,7);
        Set<Integer> set=new HashSet<>();
        list.stream().filter(x->!set.add(x)).forEach(System.out::println);


//        for(Integer s: list){
//            if(Collections.frequency(list, s) == 1){
//                System.out.println(s);

    }}



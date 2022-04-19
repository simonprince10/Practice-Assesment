package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceWords {
    public static void main(String[] args) {
        String s="This is java and this is java";
        List<String> list= Arrays.asList(s.split(" "));
        Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}



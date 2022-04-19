package com.company;

import java.util.HashMap;

public class OccuranceCounts {
    public static void main(String[] args) {
        String s="aabbccc";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=s.length()-1;i>=0;i--){
            if(map.containsKey(s.charAt(i))){
                int count=map.get(s.charAt(i));
                map.put(s.charAt(i),++count);
            }
            else
                map.put(s.charAt(i),1);
        }
        System.out.println(map);
    }
}


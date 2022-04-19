package com.company;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "ebce";
        int max=0;
        int start=0;
        int k=3;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);}
                 else {
                     map.put(c, map.get(c) - 1);
                 }
                     while(map.size()>k){
                         char temp=s.charAt(i);
                         if(map.get(temp)==1){
                             map.remove(temp);
                         }
                         else{
                             map.put(temp,map.get(temp-1));
                         }
                         start++;
                     }
                     max=Math.max(max,i-start+1);
                     }
            System.out.println(max);
        }
    }

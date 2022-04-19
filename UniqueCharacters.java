package com.company;

public class UniqueCharacters {
    public static void main(String[] args) {
        String s="aabc";
        char ch[]=s.toCharArray();
        int count=s.length();
        for(int i=0;i<s.length();i++) {
            if (i != s.indexOf(ch[i])) {
                count--;
            }
        }
        System.out.println(count);
    }
}

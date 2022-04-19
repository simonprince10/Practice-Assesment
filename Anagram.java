package com.company;

public class Anagram {
    public static void main(String[] args) {
        String word="rare";
        String anagram="care";
        System.out.println("Given word of anagram "+isAnagramusingStringMethod(word,anagram));
    }
    public static boolean isAnagramusingStringMethod(String word,String anagram) {
        if (word.length() != anagram.length()) return false;
        {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = anagram.indexOf(c);
                //if index of any character is -1 then two strings not an anagram.
                //if word not equal to -1 then remove the char from string.
                if (index != -1) {
                    anagram = anagram.substring(0, index) + (anagram.substring(index+1,anagram.length()));
                }
                 else
                    return false;
            }
                    return anagram.isEmpty();
                }

            }
        }

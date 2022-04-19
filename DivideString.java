package com.company;

public class DivideString {
  static void divideString(String str,int n){
      int size=str.length();
      int partsize;
      if(size%n!=0){
          System.out.println("String size is not divisble by n");
          return;
      }
      partsize=size/n;
      for(int i=0;i<size;i++) {
          if (i % partsize==0)
            System.out.println();
              System.out.print(str.charAt(i));
          }
      }

    public static void main(String[] args) {
        String str="aaabcc";
        divideString(str,3);
    }
}

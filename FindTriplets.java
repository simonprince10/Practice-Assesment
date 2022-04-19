package com.company;

public class FindTriplets {
    public static void main(String[] args) {
        int arr[]={1,-3,4,5,2};
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println();
                    }
                }
            }
        }
    }
}

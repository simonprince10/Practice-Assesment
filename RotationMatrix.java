package com.company;

public class RotationMatrix {
    static void MatrixRotation(int arr[][]){
        //Transpose matrix
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //second rotation
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }
        }
        static void printmatrix(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println( );
                }
            }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        MatrixRotation(arr);
        printmatrix(arr);
    }}



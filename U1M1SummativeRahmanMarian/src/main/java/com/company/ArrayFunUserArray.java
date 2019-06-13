package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        // Easy way.
            //reading from user
//        System.out.println("Enter a value:");
//        int a= scanner. nextInt();
//        System.out.println("Enter a value:");
//        int b= scanner.nextInt();
//        System.out.println("Enter a value:");
//        int c= scanner.nextInt();
//        System.out.println("Enter a value:");
//        int d= scanner.nextInt();
//        System.out.println("Enter a value:");
//        int e= scanner. nextInt();
//
//        // placing in the array.
//        int[] arr= {a,b,c,d,e};
//
//
//        //printing array
//        for (int i= 0; i< arr.length;i++){
//                    System.out.println(arr[i]);
//                }

        // alternate solution for my reference
        // Array generally is rigid. So we specify the amount of values it can carry or we have to initialize with some values directly.
        int[] arr= new int[5];// allocating memory for 5 in values in an array
        // now we have arr= {0,0,0,0,0}. this is because int has a default value of 0.
        for( int i= 0 ;i<5; i++ ){
            System.out.println("Enter a value:");
            int a= scanner.nextInt();
            arr[i]= a;// changing values within the array using the index within the for loop.
        }

        // printing the array
        for (int i= 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}

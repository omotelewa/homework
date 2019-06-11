package com.company;

public class ArrayFunReverseIt {
    public static void main(String args[]){

//        // Easy way.
//        int[] arr= {1, 2, 3, 4, 5};// array initialization
//        int[] arr2= new int[arr.length];// creates new array with length equal to the length of first array.
//        // {0,0,0,0,0}. This is because we used new.
//        arr2[4]= arr[0];
//        arr2[3]= arr[1];
//        arr2[2]= arr[2];
//        arr2[1]= arr[3];
//        arr2[0]= arr[4];
//        System. out.println("First array");
//        for (int i = 0 ; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        System. out.println("Second array");
//        for (int i = 0 ; i< arr2.length; i++){
//            System.out.println(arr2[i]);
//        }

        // Hard Way

        int[] arr= {1, 2, 3, 4, 5};// array initialization
        int[] arr2= new int[arr.length];// creates new array with length equal to the length of first array.
       // i represents the indices of arr while j represents indices of arr2.
       // for each pass we will have different i and j values. Based on these values, the values in the array will change.
        // pass 1:  i = 4 j = 0   => arr2[0]= arr[4]   => i--  j++
        // pass 2: i= 3 j = 1   =>arr2[1]= arr[3]

        // normally in a for loop, we can have initialiser; condition; increment/ decrement.
        // here we have 2 sets of each of the initialiser; condition; increment/ decrement.
        for (int i = arr.length-1, j= 0;       i >=0 && j< arr2.length;      i--, j++){
            arr2[j]= arr[i];
        }

        // looping throught both arrays and printing them out.
        System. out.println("First array");
        for (int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System. out.println("Second array");
        for (int i = 0 ; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }
}

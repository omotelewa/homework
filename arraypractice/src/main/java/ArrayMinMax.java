
//creating an array to print min and max numbers
package com.company


import java.util.Scanner;

public class Arrays {

}

    public static void main(String[]args){

    }

    int [] arr = getArrayInput();
    System.out.println("Min number");
    System.out.println("Max number");

}


    public static int getMaxNumber(int[] arr){
        int maxNumber = arr[0];
        for(int element : arr){
        if (element > maxNumber){
        maxNumber=element;
        }

        return maxNumber;


public static int getSum(int[] arr){
        int sun = 0;
        for(int element : arr){
        if (element > Sum){
        Sum=element;
        }

        return sun;


public static int getMinNumber(int[] arr){
        int minNumber = arr[0];
        for(int element : arr){
        if (element > minNumber){
        minNumber=element;
        }
        return minNumber;

        public static int[] getArrayInput(){

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter number of inputs : ");
        int[] arraySize = Integer.parseInt(myScanner.nextLine());

        int[] arrayInput = new int[arraySize];

        for(int i =0; i < arrayInput.lenght; i++){
            system.out.println("Enter our number : (" + (i+1) + ")");
            integer.parseInt(myScanner.nextline());
            arrayInput [i] = Integer.parseInt(myScanner.nextLine());

        }

//Multidemensional arrays
  string[][] newarr = {
        {"a", "c", "d"};
        {"e", "f", "g"};
        {"h", "i", "j"};

        }

//use nested for loops to display whole arrays - enhanced for loop. - displays all elements with nested loop. - correct below.

for(string[] element;newArray) {
    for(String el: element){
        System.out.println(el);
    }
        }
        }

// loop to display like a matrix - prints in straight line. println adds next line characher
        for(string[] element;newArray) {
            system.out.println("");
        }
        for(String el: element){
        System.out.printf(el + "");
        }
}
        }
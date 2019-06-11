package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String args[]){
        // Creating object of a  Scanner class . And we are passing the input stream as System.in.
        // System.in is by default is set to keyboard.
        Scanner scanner= new Scanner(System.in);
        String[] strArr= new String[5];

        for (int i = 0; i< strArr.length; i++){
            // When reading string from user, use scanner.next()
            // when reading int from user, use scanner.nextInt()
            System.out.println("Enter a name:");
            String value= scanner.next();
            strArr[i]= value;
        }
        System.out.println("The values in the array  are:");

        for (int i= 0 ; i< strArr.length; i++){
            System.out.println(strArr[i]);
        }


    }
}

package com.company;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args){

        System.out.println("Please enter a value between 1 to 10");
        Scanner sc = new Scanner(System.in);

        int number= sc.nextInt();
        if (number<1 || number >12){
            System.out.println("You must enter a number between 1 and 10, please try again");
        }
        else{
            System.out.println(number);
        }

    }
}

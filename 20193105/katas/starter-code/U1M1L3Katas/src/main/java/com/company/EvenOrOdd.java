import java.util.Scanner;
package com.company;

    public static void main(String[] args) {

    }
}


class EvenOdd
{
    public static void main(String args[])
    {
        int x;
        System.out.println("Enter an integer to check if it is even or odd ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if ( x % 4 == 0 )
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}
 
 
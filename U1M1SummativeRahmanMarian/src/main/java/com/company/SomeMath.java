package com.company;

public class SomeMath {
    public static void main(String args[]){
//        int result= total5(1,2,3,4,5);// calling the total5 method  and sending 5 parameters
//        System.out.println( result);
        // We can do the above thing as:
        System.out.println(total5(1, 2, 3, 4, 5)); // calling the total method  and sending 5 parameters
        System.out.println(average5(1, 3, 5, 7, 9));// // calling the average method  and sending 5 parameters
        System.out.println(largest5(42.0, 35.1, 2.3, 40.2, 15.6)); // calling the largest method  and sending 5 parameters
    }

    public static int  total5(int a, int b, int c, int d, int e){// here, a...e are parameters.
        int sum= a+b+c+d+e; // calculating sum
        return sum;// returning value
    }
    public static double  average5(int a, int b, int c, int d, int e){// parameters
        int sum= a+b+c+d+e;// sum
        double avg= sum/ 5;// average
        return avg;// returning avg
    }

    public static double largest5(double a, double b, double c, double d, double e){// parameters
        if (a>b && a>c && a>d && a>e){// checking if a is the largest
            return a;// it a is the largest, we are returning value of a.
        }
        // if tha a is not the largest, we do not need to worry about a from here on. so we do not check wit a here
        else if(b> c && b> d && b> e){
            return b;
        }
        else if(c>d && c> e){
            return c;
        }
        else if (d> e){
            return  d;
        }
        else{
            return  e;
        }
    }

}

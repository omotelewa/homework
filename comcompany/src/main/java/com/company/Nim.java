package com.company;

import java.util.Scanner;

public class Nim {
    public static void main(String args[]){
        int apileCounter= 3;
        int bpileCounter= 3;
        int cpileCounter= 3;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Player 1 Name:");
        String p1= sc.next();
        System.out.print("Enter Player 2 Name:");
        String p2= sc.next();
        int turn= 1;


        while (apileCounter>0 || bpileCounter>0 || cpileCounter>0){
            System.out.println();
            System.out.println("A:"+apileCounter+"\tB:"+ bpileCounter+"\tC:"+ cpileCounter);
            System.out.println();
            if (turn==1){
                System.out.print(p1+", Choose a Pile:");
            }
            else{
                System.out.print(p2+", Choose a Pile:");
            }
            String pile= sc.next();
            System.out.print("How many to remove from the Pile "+pile+":");
            int num= sc.nextInt();
            if (pile.equalsIgnoreCase("a")){
                apileCounter-=num;
            }
            else if(pile.equalsIgnoreCase("b")){
                bpileCounter-=num;
            }
            else if(pile.equalsIgnoreCase("c")){
                cpileCounter-=num;
            }

            if(apileCounter<=0 && bpileCounter<=0&& cpileCounter<=0){
                System.out.println("All piles are empty! Good Job.");
                if (turn==1){
                    System.out.println(p1+ " is LOOSER");

                }
                else{
                    System.out.println(p2+ " is LOOSER");
                }
                System.exit(0);

            }



            if(turn==1){
                turn= 2;
            }
            else{
                turn=1;
            }



        }

    }
}

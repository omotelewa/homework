package com.company;

import java.util.Scanner;

public class BabyNim {
    public static void main(String args[]){
        int apileCounter= 3;
        int bpileCounter= 3;
        int cpileCounter= 3;
        Scanner sc= new Scanner(System.in);
        while (apileCounter>0 || bpileCounter>0 || cpileCounter>0){
            System.out.println();
            System.out.println("A:"+apileCounter+"\tB:"+ bpileCounter+"\tC:"+ cpileCounter);
            System.out.println();
            System.out.print("Choose a Pile:");
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
            }
        }



    }
}

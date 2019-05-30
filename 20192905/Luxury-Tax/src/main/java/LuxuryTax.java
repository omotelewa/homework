import java.util.Scanner;

public class LuxuryTax {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Provide salary for player 1");
        String firstInput = myScanner.nextLine();
        System.out.println("Provide salary for player 2");
        String secondInput = myScanner.nextLine();
        System.out.println("Provide salary for player 3");
        String thirdInput = myScanner.nextLine();

        float firstSalary = Float.parseFloat(firstInput);
        float secondSalary = Float.parseFloat(secondInput);
        float thirdSalary = Float.parseFloat(thirdInput);

        float totalSalary = firstSalary + secondSalary + thirdSalary;

        if (totalSalary >= 40000000) {

            float luxuryTax = totalSalary * .18f;

            System.out.printf("%.2f", luxuryTax);

        } else {

            System.out.println("You are under the luxury tax");


        }
    }
}
public class FizzBuzz {
    public static void main(String[] args) {

    }
}
System.out.println("Welcome to Hi-Low!");
Scanner myScanner = new Scanner(System.in);
        //if( (number%3==0) && (number%5==0)) {
        return "FizzBuzz";
        }
        else if( number%3 == 0 ) {
        return "Fizz";
        } else if( number%5 == 0 ) {
        return "Buzz";
        } else {
        return ""+number;
        }
        }

/*
 * use a for loop to print the appropriate FizzBuzz values (feel free to
 * call the provided FizzBuzz function) for values from from to to,
 * including both of those values. Each value should be printed in a separate line.
 */
public static void printFizzBuzz(int from, int to, PrintStream out)
        {
        for (int i = 1; i <= to; ++i){
        FizzBuzz(++i);
        }
        }

package students.test;

/**
 * Created by ngondo on 2/24/16.
 */
public class NumberPrinter {
    public static void main(String[] args) {
        int j;

        NumberPrinter x = new NumberPrinter();

        for (j = 1; j <= 100; j++) {

            checkDivisibility(j);
        }
    }

    public static void checkDivisibility(int n) {

        if (n % 3 == 0 && n%5 ==0) {
            System.out.print(" FizzBuzz ");
        }

        else if (n % 5 == 0) {
            System.out.print(" Buzz ");

        }

        else if (n % 3 == 0) {
            System.out.print(" Fizz ");
        }

        else {
            System.out.print(" "+n+" ");
        }
    }

}

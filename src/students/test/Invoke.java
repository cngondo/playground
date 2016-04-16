package students.test;

import java.util.Scanner;

/**
 * Created by ngondo on 2/24/16.
 */
public class Invoke {
    public static void main(String args[]){

        @SuppressWarnings("resource")

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value you scored");

        int Grade = input.nextInt();

        if (Grade >79){System.out.println("A");} else

        if (Grade >69){System.out.println("B");} else

        if (Grade >49){System.out.println("C");} else

        if (Grade >39){System.out.println("D");} else

        {System.out.println("Fail");}



        System.out.println("Your grade is "+ Grade);

    }
}

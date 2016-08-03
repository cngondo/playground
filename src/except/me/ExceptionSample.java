package except.me;

import java.util.Scanner;

/**
 * Created by ngondo on 8/3/16.
 */
public class ExceptionSample {
    public static void main(String... args){
        /*
        * Here we are trying to access an array element that does not exist.
        * We therefore provide an exception that handles the error, instead of letting
        * the program crash and exit.
        * */
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Weuweee!! hiyo haiko!!");
        }
        System.out.println("Out of the block! Check reference value");

        division();
    }

    static void division(){
        /*
        * I've tried the common "divide by zero" error but looks like this version of Java
        * is able to handle that. The result is infinity! Niice!
        * */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        double firstNumber = input.nextDouble();

        System.out.println("Enter a second number");
        double secondNumber = input.nextDouble();

        double quotient = Math.ceil(firstNumber/secondNumber);
        System.out.println(firstNumber + " divided by " + secondNumber + " gives you " + quotient);
    }
}

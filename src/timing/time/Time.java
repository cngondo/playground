package timing.time;

import java.util.Scanner;
/**
 * Created by ngondo on 2/17/16.
 */
/*
* Takes time in seconds as input and converts it to
* hours minutes and seconds
* */
public class Time {
    int secin;
    static public void main(String[]args){
        System.out.println("Enter time in seconds: ");
        int secin = new Scanner(System.in).nextInt();
    }

    int hours(){
        if(secin > 3600){
            int hrs = secin / 3600;
            return hrs;
        }
        return secin;
    }
}

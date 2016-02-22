package leaping.leap;

/**
 * Created by ngondo on 2/1/16.
 */

/*
* prints the next 10 leap years
* */
public class Leap {
    public static void main(String[]argy){
        int leap = 2016;
        for(int i = leap; i < leap + 40; i+=4){
            System.out.print(i + "\n");
        }
    }
}

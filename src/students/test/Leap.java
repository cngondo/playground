package students.test;

/**
 * Created by ngondo on 2/24/16.
 */
public class Leap {
    public static void main(String[]args){
        int Year,Count;
        Count = 0; Year = 2016;
        while (Count <10){
            Year= Year + 4;
            Count= Count+ 1;
            System.out.println("The next leap year is: " + (Year));}
    }
}

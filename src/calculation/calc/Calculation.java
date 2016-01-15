package calculation.calc;

/**
 * Created by ngondo on 1/15/16.
 */
public class Calculation {
    int z;
    //Method that adds numbers
    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum of the given numbers is:" + z);
    }
    //method that gets the difference
    public void subtraction(int x, int y){
        z = x - y;
        System.out.println("The difference between the given numbers is:" + z);
    }
}

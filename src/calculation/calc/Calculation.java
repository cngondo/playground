package calculation.calc;

/**
 * Created by ngondo on 1/15/16.
 */
public class Calculation {
    int z;

//    Calculation cl = new Calculation();
//    cl.addition(3, 5);

    //Method that adds numbers
    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum of the given numbers is:" + z);
    }
    //method that gets the difference
    protected void subtraction(int x, int y){
        z = x - y;
        System.out.println("The difference between the given numbers is:" + z);
    }
}

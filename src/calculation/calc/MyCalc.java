package calculation.calc;

/**
 * Created by ngondo on 1/15/16.
 */
public class MyCalc extends Calculation {
    //Method that multiples numbers
    public void multiplication(int x, int y){
        z = x * y;
        System.out.println("The product of these numbers is: "+ z);
    }

    //implementation of inheritance and method calls
    public static void main(String[]args){
        int p = 30, q = 40;
        //Create object of MyCalc which can invoke all methods even
        //those in Calculation class
        MyCalc myCalc = new MyCalc();
        myCalc.addition(p,q);
        myCalc.subtraction(q,p);
        myCalc.multiplication(p,q);
    }
}

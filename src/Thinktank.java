/**
 * Created by ngondo on 1/15/16.
 */
public class Thinktank {
    public void testnumbers(){
        int aNum;
        int anotherNum = 10;
        /*
        * Testing tenary operator
        * check if anotherNum = 10. If it's true assign 5 to aNum
        * else assign 70
        *
        * (Exp1)? (Exp 2):(Exp 3)
        * If Exp1 is true, do Exp 2 else do Exp 2
        *
        * Good for longer lines of code with multiple logic statements
        * Fster in execution
        * */
        aNum = (anotherNum == 10)? 5: 70;
        System.out.println("aNum = " + aNum);
    }
}

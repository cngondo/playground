package looping.loop;

/**
 * Created by ngondo on 2/1/16.
 */

public class WhileStatement {
    public static void main(String[]args){
       WhileStatement whileStatement = new WhileStatement();
        whileStatement.whileLoop();
    }

    void whileLoop(){
        //Adds consecutive numbers from the start to the end of the loop
        int i = 20;
        int sum =0;

        while(i<30){
            i++;
            sum += i;
        }
        System.out.println(sum);
    };
}

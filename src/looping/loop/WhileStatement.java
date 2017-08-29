package looping.loop;

public class WhileStatement {

    int i = 20;
    int sum =0;

    public static void main(String[]args){
       WhileStatement whileStatement = new WhileStatement();
        whileStatement.whileLoop();
        whileStatement.forLoop();
    }

    void whileLoop(){
        //Adds consecutive numbers from the start to the end of the loop
        while(i < 30){
            i++;
            sum += i;
        }
        System.out.println(sum);
    }

    void forLoop(){
        for (int j = i ; j < 30 ;j++){
           sum += j;
        }
        System.out.println(sum);

    }


}

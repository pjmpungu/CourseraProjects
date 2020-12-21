package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private int num1, num2;
    public Subtract(int number1,int number2){
        num1=number1;
        num2=number2;
    }
    public int sub(){
        return num1-num2;
    }
    public static int sub(int num1, int num2){
        return num1+num2;
    }
}

package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int num1, num2;
    public Multiply(int number1,int number2){
        num1=number1;
        num2=number2;
    }
    public int mult(){
        return num1*num2;
    }
    public static int mult(int num1, int num2){
        return num1*num2;
    }
}

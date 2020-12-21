package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private int num1, num2;
    public Divide(int number1,int number2){
        num1=number1;
        num2=number2;
    }
    public int divide(){
        return num1/num2;
    }
    public int rem(){
        return num1%num2;
    }
    public static int divide(int num1, int num2){
        return num1/num2;
    }
    public static int rem(int num1, int num2){
        return num1%num2;
    }
}

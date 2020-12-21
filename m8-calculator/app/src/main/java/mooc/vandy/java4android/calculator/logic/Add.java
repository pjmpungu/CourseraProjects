package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    private int num1, num2;
    public Add(int number1,int number2){
        num1=number1;
        num2=number2;
    }
    public int add(){
        return num1+num2;
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }

}

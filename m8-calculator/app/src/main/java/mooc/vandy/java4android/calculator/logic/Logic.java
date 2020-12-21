package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    static final int ADDITION=1;
    static final int SUBTRACTION=2;
    static final int MULTIPLICATION=3;
    static final int DIVISION=4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        //printing out my output, I just created classes with simple static methods for each operation
        if (operation==ADDITION){
            mOut.print(Integer.toString(Add.add(argumentOne,argumentTwo)));
        }else if(operation==SUBTRACTION){
            mOut.print(Integer.toString(Subtract.sub(argumentOne,argumentTwo)));
        }else if(operation==MULTIPLICATION){
            mOut.print(Integer.toString(Multiply.mult(argumentOne,argumentTwo)));
        }else if(operation==DIVISION){
            mOut.print(Integer.toString(Divide.divide(argumentOne,argumentTwo))+" R: "+Integer.toString(Divide.rem(argumentOne,argumentTwo)));
        }
        
    }
}

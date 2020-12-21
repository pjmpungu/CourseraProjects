package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    //instance vars
    public static final int IN=1;
    public static final int OUT=-1;
    public static final int CLOSED=0;
    private int mSwing;
    public Gate(){

    }
    public boolean setSwing(int direction){
        if(direction==IN || direction==OUT ||direction==CLOSED) {
            mSwing = direction;
            return true;
        }else{
            return false;
        }
    }
    public boolean open(int direction){
        if(direction==IN || direction==OUT){
            return setSwing(direction);
        }else{
            return false;
        }
    }
    public void close(){
        mSwing=CLOSED;
    }
    public int getSwingDirection(){
        return mSwing;
    }
    public int thru(int count){
        return mSwing*count;
    }

    @Override
    public String toString() {
        if(getSwingDirection()==CLOSED){
            return "This gate is closed";
        }else if(getSwingDirection()==IN){
            return "This gate is open and swings to enter the pen only";
        }else if(getSwingDirection()==OUT){
            return "This gate is open and swings to exit the pen only";
        }else {
            return "This gate has an invalid swing direction";
        }
    }
}

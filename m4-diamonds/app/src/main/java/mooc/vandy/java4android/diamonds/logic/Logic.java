package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        // TODO -- add your code here
        printTops(size);
        //this part prints the top half of the diamond
        //first create a variable to print - or =
        String str="=";
        if(size>=2) {
            mOut.println();
            //this for loop prints out each line above the center of the diamond
            for(int j=0; j<(size-1); j++){
                //these loops print out the spaces
                mOut.print("|");
                for (int k = 0; k < (size - 1-j); k++) {
                    mOut.print(" ");
                }

                //next print out the part where the actual /\ is
                mOut.print("/");
                for(int k=0;k<(2*j);k++){
                    mOut.print(str);
                }
                mOut.print("\\");
                //then print left side with spaces
                for (int k = 0; k < (size - 1-j); k++) {
                    mOut.print(" ");
                }
                mOut.print("|");
                //change the value of str to be - or =
                if(str.equals("-"))
                    str="=";
                else
                    str="-";
                mOut.println();
            }
        }else
            mOut.println();
        //now print the center
        mOut.print("|<");
        for(int k=0;k<(2*(size-1));k++){
            mOut.print(str);
        }
        mOut.print(">|");
        //print the bottom half of the diamond, basically same as code above for top half but using \/
        if(size>=2) {
            mOut.println();
            //this for loop prints out each line below the center of the diamond
            for(int j=0; j<(size-1); j++){
                //change the value of str to be - or =
                if(str.equals("-"))
                    str="=";
                else
                    str="-";
                //these loops print out the spaces
                mOut.print("|");
                for (int k = 0; k < j+1; k++) {
                    mOut.print(" ");
                }
                //next print out the part where the actual /\ is
                mOut.print("\\");
                for(int k=0;k<2*(size-2-j);k++){
                    mOut.print(str);
                }
                mOut.print("/");
                //then print left side with spaces
                for (int k = 0; k < j+1; k++) {
                    mOut.print(" ");
                }
                mOut.print("|");
                mOut.println();
            }
        }else
            mOut.println();
        //finally, print the bottom
        printTops(size);
        
    }

    // TODO -- add any helper methods here
    //method prints top and bottoms of picture frame
    public void printTops (int size){
        mOut.print("+");
        for(int k=0; k<size;k++){
            mOut.print("--");
        }
        mOut.print("+");
    }
    
}

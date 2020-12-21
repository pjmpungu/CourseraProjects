package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    public static final int HERD=24;
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mWestGate;

    /**
     * The output Gate object.
     */
    private Gate mEastGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out, Gate westGate, Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public void simulateHerd(Random rand){
        //variable for snails in the pen
        int snailsInPen=HERD;
        //iteration to run 10 times
        mOut.println("There are currently "+ snailsInPen+ " snails in the pen and "+(HERD-snailsInPen)+" snails in the pasture");
        for(int k=0;k<MAX_ITERATIONS;k++){
            //first test if all snails are in pen or out
            if(snailsInPen==24){
                snailsInPen+=mEastGate.thru(rand.nextInt(HERD)+1);
                mOut.println("There are currently "+ snailsInPen+ " snails in the pen and "+(HERD-snailsInPen)+" snails in the pasture");
            }else if(snailsInPen==0){
                snailsInPen+=mWestGate.thru(rand.nextInt(HERD)+1);
                mOut.println("There are currently "+ snailsInPen+ " snails in the pen and "+(HERD-snailsInPen)+" snails in the pasture");
            }
            //now choose random gate and send snails through
            else{
                if(rand.nextBoolean()){
                    snailsInPen+=mWestGate.thru(rand.nextInt(HERD-snailsInPen)+1);
                    mOut.println("There are currently "+ snailsInPen+ " snails in the pen and "+(HERD-snailsInPen)+" snails in the pasture");
                }else{
                    snailsInPen+=mEastGate.thru(rand.nextInt(snailsInPen)+1);
                    mOut.println("There are currently "+ snailsInPen+ " snails in the pen and "+(HERD-snailsInPen)+" snails in the pasture");
                }
            }
        }
        //done
    }

    
}

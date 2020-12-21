package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate [] gate, Random rand){
        //just a for loop loop to go through each value in the array
        for(int k=0;k<gate.length;k++){
            gate[k].setSwing(rand.nextInt(3)-1);
            mOut.println("Gate "+k+": "+gate[k]);
        }
    }
    public boolean anyCorralAvailable(Gate[] corral){
        boolean hasIn=false;
        for(Gate element: corral){
            if(element.getSwingDirection()==Gate.IN)
                hasIn=true;
        }
        return hasIn;
    }
    public int corralSnails(Gate[] corral, Random rand){
        int snailsInPas=5;
        int counter=0;
        //using a while loop until snaislinpas=0
        while(snailsInPas!=0){
            //first choose random gate index
            int index=rand.nextInt(corral.length);
            //now just generate number for moving snails and adjust variables
            int moving=rand.nextInt(snailsInPas)+1;
            snailsInPas-=corral[index].thru(moving);
            mOut.println(moving+" are trying to move through corral "+(index));
            counter++;
        }
        mOut.println("It took "+counter+" attempts to corral all of the snails.");
        return counter;
    }

    
}

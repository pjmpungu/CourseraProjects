package mooc.vandy.java4android.birthday.logic;

import java.util.Random;

import mooc.vandy.java4android.birthday.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early Android interactions.
 * Designing the assignments this way allows you to first learn key 'Java' features without
 * having to beforehand learn the complexities of Android.
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
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * <p>
     * It is called 'mOut' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'mOut' is good enough).
     */
    OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance
     * (which implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out) {
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labelled 'Process' is pressed.
     */
    public void process() {
        int groupSize = mOut.getSize();
        int simulationCount = mOut.getCount();

        if (groupSize < 2 || groupSize > 365) {
            mOut.println("Error: Group Size must be in the range 2-365.");
            return;
        }
        if (!(simulationCount >= 1 && simulationCount <= 100000)) {
            mOut.println("Error: Simulation Count must be in the range 1-100000.");
            return;
        }

        double percent = calculate(groupSize, simulationCount);

        // report results
        mOut.println("For a group of " + groupSize + " people, the percentage "
                + " of times that two people share the same birthday is "
                + String.format("%.2f%% of the time.", percent));

    }

    /**
     * This is the method that actually does the calculations.
     * <p>
     * We provide you this method that way we can test it with unit testing.
     */
    public double calculate(int size, int count) {
        // TODO -- add your code here
        //keeps track of instances with repeat birthday
        double sameBday=0;
        //first do for loop for number of simluations
        for(int k=0;k<count;k++){
            //initlialize random object for each simluation
            Random rand=new Random();
            rand.setSeed(k+1);
            //variable to stop runtime if birhtday is found, counter, and array of booleans
            boolean matchFound=false;
            int counter=0;
            boolean bday[]=new boolean[365];
            //simulation starts
            while(counter<size && !matchFound){
                int hold=rand.nextInt(365);
                if(bday[hold])
                    matchFound=true;
                else
                    bday[hold]=true;
                counter++;
            }
            if (matchFound){
                sameBday++;
            }
        }
        return(sameBday/count)*100.0;
        
    }


    // TODO -- add your helper methods here
    
}

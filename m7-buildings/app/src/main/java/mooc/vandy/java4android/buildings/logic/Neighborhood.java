package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {

    // TODO - Put your code here.
    private Neighborhood(){

    }
    public static void print(Building[] buildings, String header, OutputInterface out){
        out.println(header);
        for (int k=0;k<buildings.length;k++){
            out.println(buildings[k].toString());
        }
    }
    public static int calcArea(Building[] buildings){
        int area=0;
        for(int k=0;k<buildings.length;k++){
            area+=buildings[k].calcLotArea();
        }
        return area;
    }
}

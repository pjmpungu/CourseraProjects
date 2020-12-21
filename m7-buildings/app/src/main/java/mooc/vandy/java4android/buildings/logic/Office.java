package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices=0;
    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
    }
    public  Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length, width, lotLength, lotWidth);
        mBusinessName=businessName;
        sTotalOffices++;
    }
    Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        super(length, width, lotLength, lotWidth);
        mBusinessName=businessName;
        mParkingSpaces=parkingSpaces;
        sTotalOffices++;
    }
    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    public static int getTotalOffices() {
        return sTotalOffices;
    }
    public boolean equals(Office office){
        return(this.calcBuildingArea()==office.calcBuildingArea() && this.mParkingSpaces==office.mParkingSpaces);
    }

    @Override
    public String toString() {
        if(mBusinessName==null)
            return "Business: unoccupied (total offices: "+sTotalOffices+")";
        else
            return mBusinessName+"; has "+mParkingSpaces+" parking spaces (total offices: "+sTotalOffices+")";
    }
}

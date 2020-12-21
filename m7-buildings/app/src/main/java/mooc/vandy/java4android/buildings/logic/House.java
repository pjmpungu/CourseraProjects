package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {


    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;
    public House(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
    }
    public  House(int length, int width, int lotLength, int lotWidth, String owner){
        super(length, width, lotLength, lotWidth);
        mOwner=owner;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        super(length, width, lotLength, lotWidth);
        mOwner=owner;
        mPool=pool;
    }
    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }
    public boolean equals(House house){
        if(this.calcBuildingArea()==house.calcBuildingArea() && this.hasPool()==house.hasPool())
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        String str="Owner: "+getOwner();
        if(hasPool())
            str=str+"; has a pool";
        if(this.calcLotArea()>this.calcBuildingArea())
            str=str+"; has a big open space";
        return str;
    }
}

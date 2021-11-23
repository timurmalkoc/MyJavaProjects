package AbstractInterface;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int gearNumber;
    private boolean clutchIn = false;
    private int currentGear = 0;

    public GearBox(int maxGear) {
        this.maxGear = maxGear;
        this.gearNumber = 0;
        gears = new ArrayList<>();
    }

    public void addGear(int gearNumber, double ratio){
        if ((gearNumber>0) && (gearNumber <= maxGear))
        this.gears.add(new Gear(gearNumber, ratio));
    }

    public void operateClutch(boolean in){
        this.clutchIn = true;
    }

    public void changeGear(int newGear){
        if ((newGear>=0) && (newGear < this.gears.size()) && this.clutchIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else{
            System.out.println("Grind !");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (clutchIn){
            System.out.println("Scream !");
            return 0.0;
        }
        return revs * gears.get(this.currentGear).getRatio();
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs * this.ratio;
        }
    }
}

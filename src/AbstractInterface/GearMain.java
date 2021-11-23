package AbstractInterface;

public class GearMain {

    public static void main(String[] args) {
        GearBox gearBox = new GearBox(5);

        gearBox.addGear(1,5.5);
        gearBox.addGear(2,6.5);
        gearBox.addGear(3,7.4);
        gearBox.addGear(4,10);
        gearBox.addGear(5,13);

        System.out.println(gearBox.wheelSpeed(1000));
        


    }




}

package Expressions;

public class InchToCm {
    public static void main(String[] args) {

    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (isValid(feet,inches))
            return feet*12+inches*2.54;
        else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (isValid(inches))
            return inches*2.54;
        else
            return -1;
    }


    public static boolean isValid(int feet, int inches){
        if ((feet>=0)&&(inches>=0)&&(inches<=12))
            return true;
        return false;
    }
    public static boolean isValid(int inches){
        if (inches>=0)
            return true;
        return false;
    }
}

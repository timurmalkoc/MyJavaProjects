package Expressions;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }

    public static double area(double radius){
        if (isValid(radius))
            return radius*radius*Math.PI;
        return -1.0;
    }

    public static double area(double x1,double y1){
        if (isValid(x1,y1))
            return x1*y1;
        return -1.0;
    }

    public static boolean isValid(double val){
        if (val<0)
            return false;
        return true;
    }
    public static boolean isValid(double val1, double val2){
        if (val1<0 || val2<0)
            return false;
        return true;
    }
}

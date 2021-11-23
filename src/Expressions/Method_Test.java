package Expressions;

public class Method_Test {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(-1);
        printConversion(25.42);
        printConversion(75.144);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long result;
        if(kilometersPerHour < 0)
        result =-1;
        else
        result = Math.round(kilometersPerHour/1.609);

        return result;
    }

    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if (result < 0)
        System.out.println("Invalid");
        else
        System.out.println(kilometersPerHour + "km/h" + " = " + result + " mi/h");
    }

}

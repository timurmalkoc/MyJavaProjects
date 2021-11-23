package Expressions;

public class MinutesToYears {
    public static void main(String[] args) {
    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes<0)
            System.out.println("Invalid Value");
        else{
            long year=0;
            long day=0;
            year = minutes / (60*24*365);
            day = (minutes - (year * 60*24*365)) / (60*24);
            System.out.println(minutes+" min = "+year + " y and "+ day + " d");}
    }
}

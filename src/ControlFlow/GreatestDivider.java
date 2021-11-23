package ControlFlow;

public class GreatestDivider {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if (first >=10 && second>=10){
            int small = first;
            if (second > first)
                small = second;
            int divisor = 1;
            for (int i=1; i<=small; i++){
                if (first%i==0 && second%i==0)
                    divisor=i;
            }
            return divisor;
        }
        return -1;
    }
}

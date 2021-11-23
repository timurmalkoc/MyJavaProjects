package ControlFlow;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
    }

    public static boolean isOdd(int number){
        if (number%2==1)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        if (start<=end && start>0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i))
                    sum += i;
            }
            return sum;
        }
        else
            return -1;
    }
}

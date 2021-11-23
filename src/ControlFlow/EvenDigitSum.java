package ControlFlow;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if (number>=0){
            int current,currentVal = number;
            int total = 0;
            while (currentVal!=0 || currentVal<0){
                current = currentVal % 10;
                currentVal = currentVal / 10;

                if (current%2==0)
                    total += current;
            }
            return total;
        }
        return -1;
    }
}

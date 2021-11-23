package ControlFlow;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
    }

    public static int sumFirstAndLastDigit (int number){
        if (number >=0 ) {
            int lastDigit=number%10;
            int current = number;
            while (current!=0 || current<0){
                current = current/10;
                if (current!=0)
                lastDigit = current;
            }
                return lastDigit+(number%10);
        }
        return -1;
    }
}

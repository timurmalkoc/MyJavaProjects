package ControlFlow;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,45));
    }

    public static boolean hasSharedDigit(int number1, int number2){
        if ((number1>=10 && number1<=99) && (number2>=10 && number2<=99)){
         int n1d1, n1d2, n2d1, n2d2;
            n1d1 = number1%10;
            n1d2 = number1/10;
            n2d1 = number2%10;
            n2d2 = number2/10;

            if ((n1d1==n2d1 || n1d1==n2d2) || (n1d2==n2d1 || n1d2==n2d2))
            return true;
        }
        return false;
    }
}

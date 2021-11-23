package ControlFlow;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number){
        if (number>9 || number<-9) {
            int reverse = 0;
            int current = number;
            while (current!=0 || current>0){
                reverse = reverse *10;
                reverse = reverse+(current % 10);
                current = current/10;
            }
            System.out.println(reverse);
            if (reverse == number)
                return true;
        }
        return false;
    }
}

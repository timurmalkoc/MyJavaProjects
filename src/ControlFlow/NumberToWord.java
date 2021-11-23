package ControlFlow;

public class NumberToWord {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static int getDigitCount(int number) {
        if (number >= 0) {
            int current = number;
            int count = 0;
            while (current != 0) {
                count++;
                current /= 10;
            }
            if (number == 0)
                count++;
            return count;
        }
        return -1;
    }

    public static int reverse(int number) {
        int current = number;
        int reversed = 0;
        while (current != 0) {
            reversed += current % 10;
            current /= 10;
            if (current != 0)
                reversed *= 10;
        }
        return reversed;
    }

    public static void numberToWords(int number) {
        if (number >= 0) {
            int reversedNumber = reverse(number);
            int digit = 0;
            int totalDigit = getDigitCount(number);
            while (totalDigit != 0) {
                totalDigit--;
                digit = reversedNumber % 10;
                reversedNumber /= 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Wrong Number");
                        break;
                }
            }
        }
        else
            System.out.println("Invalid Value");
    }
}

package ControlFlow;

import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAverage();
    }
    public static void inputThenPrintSumAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        long average;
        int number=0;
        while (true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
            number = scanner.nextInt();
            sum += number;
            counter++;
            }
            else
                break;
        }
        if (counter == 0)
            System.out.println("SUM = "+sum+" AVG = 0");
        else
            System.out.println("SUM = "+sum+" AVG = "+Math.round((double) sum/counter));
        System.out.println(counter);
    }
}

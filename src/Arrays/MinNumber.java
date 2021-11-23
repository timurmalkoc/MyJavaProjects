package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readElements(readInteger());
        System.out.println("Min is = "+findMin(myArray));
        print(reverse(myArray));
    }

    public static int[] readElements(int number){
        int[] myArray = new int[number];
        for (int i = 0; i< myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static int findMin(int[] myArray){
        int min = myArray[0];
        for (int i = 1; i< myArray.length; i++){
            if (min > myArray[i])
                min = myArray[i];
        }
        return min;
    }

    public static int readInteger(){
        System.out.println("Enter the number of element in the array");
        return scanner.nextInt();
    }

    private static int[] reverse(int[] myArray){
        int temp;
        System.out.println("Current Array = " + Arrays.toString(myArray));
        for (int i=0; i< myArray.length/2; i++){
            temp = myArray[i];
            myArray[i]= myArray[myArray.length-i-1];
            myArray[myArray.length-i-1] = temp;
        }
        return myArray;
    }

    private static void print(int[] myArray){
        System.out.println("Reversed Array = "+Arrays.toString(myArray));
    }
}

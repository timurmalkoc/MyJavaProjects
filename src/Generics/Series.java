package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Series {
    public static int nSum(ArrayList<Integer> series){
        int total=0;

        for (int i=0; i<series.size();i++){
            total+=series.get(i);
        }
        return total;
    }

    public static void factorial(ArrayList<Integer> series){
        if (series.isEmpty())
            System.out.println("There is no item in the list");
        else {
            for (int i =0; i<series.size();i++) {
                if (series.get(i)==0)
                    System.out.println(series.get(i) + " factorial = 0");
                else {
                    int total=1;
                    for (int j=1; j<=series.get(i);j++)
                        total *= j;
                    System.out.println(series.get(i) + " factorial = " + total);
                }
            }
        }
    }

    public static void fibonacci(ArrayList<Integer> series){
        if (series.isEmpty())
            System.out.println("There is no item in the list");
        else
        {
            for (int i=0; i<series.size();i++) {
                if (series.get(i)==0)
                    System.out.println("f(0)\t=[0]");
                else if (series.get(i)==1)
                    System.out.println("f(1)\t=[0, 1]");
                else {
                    int[] temp = new int[series.get(i)];
                    temp[0] = 0;
                    temp[1] = 1;
                    for (int j=2; j< series.get(i); j++) {
                        temp[j] = temp[j-1] + temp[j-2];
                    }
                    System.out.println("f("+series.get(i)+")\t="+Arrays.toString(temp));
                }
            }
        }
    }

}

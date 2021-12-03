package Collections;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List myList;
        myList = fill();

        System.out.println("item is status = " + search(myList,"C"));
        System.out.println("item is status = " + binary(myList,"C"));
    }

    public static List fill(){
        List<String> myList = new ArrayList<>();
        int counter = 0;
        for (char i = 'A'; i<= 'Z';i++){
            myList.add(i+"");
            counter++;}
        System.out.println("Total search = " + counter);
            return myList;
    }

    public static boolean search(List<String> list,String c){
        for (String i : list){
            if (i.equals(c))
                return true;
        }
        return false;
    }

    public static boolean binary(List<String> list, String c){
        int low = 0;
        int high = list.size();
        int counter=0;
        while (low<=high){
            counter++;
            int mid = (low+high) /2;
            String midVal = list.get(mid);
            int cmp = midVal.compareTo(c);

            if (cmp < 0)
                low = mid+1;
            else if (cmp > 0)
                high = mid -1;
            else {
                System.out.println("Total search = " + counter);
                return true;}
        }
        System.out.println("Total search = " + counter);
        return false;
    }
}

package Generics;


import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static <T> boolean isEqual(List<T> t1, List<T> t2){
        return t1.equals(t2);
    }

    public static void main(String[] args) {
        ArrayList<String> g1 = new ArrayList<>();
        g1.add("A");
        ArrayList<String> g2 = new ArrayList<>();
        g2.add("A");
        ArrayList<Integer> g3 = new ArrayList<>();
        g3.add(4);
        System.out.println(isEqual(g1,g2));
        // System.out.println(isEqual(g1,g3));
    }
}

package Arrays;

import java.awt.event.MouseAdapter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        addOrder(myList,"Sydney");
        addOrder(myList,"Melbourne");
        addOrder(myList,"Brisbane");
        addOrder(myList,"Perth");
        addOrder(myList,"Canberra");
        addOrder(myList,"Adelaide");
        addOrder(myList,"Darwin");

        //printList(myList);

        addOrder(myList,"Alice Springs");
       // printList(myList);

        addOrder(myList,"Sydney");
        printList(myList);

        visit(myList);
    }

    private static void printList(LinkedList<String> myList){
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println("Now visiting "+ iterator.next());
        }
        System.out.println("===================================");
    }

    private static boolean addOrder(LinkedList<String> myList, String city){
        ListIterator<String> listIterator = myList.listIterator();

        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(city);
            if (comparison == 0) {
                System.out.println("Item is already in the list!!");
                return false;
            }
            else if (comparison > 0){
                listIterator.previous();
                listIterator.add(city);
                return true;
            }
            else if (comparison < 0){
            // move next

            }

        }
        listIterator.add(city);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit=false;
        boolean forward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }
        else{
            System.out.println("Now visiting "+ listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over !!! ");
                    quit= true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext())
                            listIterator.next();
                        forward=true;
                    }
                    if (listIterator.hasNext())
                        System.out.println("Now visiting "+ listIterator.next());
                    else{
                        System.out.println("Reached the end of the itinerary");
                        forward=false;}
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious())
                            listIterator.previous();
                        forward=false;
                    }
                    if (listIterator.hasPrevious())
                        System.out.println("Now visiting "+ listIterator.previous());
                    else{
                        System.out.println("Reached the start of the itinerary");
                        forward =true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu(){
        System.out.println( "Available actions ");
        System.out.println( "0 - quit \n" +
                            "1 - next city \n" +
                            "2 - previous city \n"+
                            "3 - print menu");
    }



}

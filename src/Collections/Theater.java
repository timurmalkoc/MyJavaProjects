package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Theater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();

    public Theater(String theaterName, int numRow, int seatPerRow) {
        this.theaterName = theaterName;

        char lastRow = (char) ('A' + (numRow - 1));

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber) {
//        Seat requestSeat = null;
//        for (Seat seat : seats) {
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestSeat = seat;
//                break;
//            }
//        }
//        if (seatNumber == null) {
//            System.out.println("Enter a seat number");
//            return false;
//        }
//        return requestSeat.reserve();

        // ******* Binary search
        Seat requestSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestSeat,null);
        // System.out.println(foundSeat);
        if (foundSeat >= 0){
            System.out.println("Successfully reserved !! ");
            return seats.get(foundSeat).reserve();
        }
        else
            System.out.println("Seat is not available or not found");
            return false;
    }

    public void getSeat() {
        for (Seat seat : seats)
            System.out.println(seat.getSeatNumber());
    }


    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        private Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if (this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }
            return false;
        }

        public boolean cancel(){
            if (!this.reserved){
                this.reserved = false;
                System.out.println("Seat "+ seatNumber + " canceled");
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }

}

package Busrev;

import java.util.*;

public class Akbusbooking {
    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookbus = new ArrayList<Booking>();
        buses.add(new Bus(1, true, 1));
        buses.add(new Bus(2, false, 15));
        buses.add(new Bus(3, true,12));

        Scanner scan = new Scanner(System.in);

        System.out.println("====== Welcome to Bus Booking System ======");
        System.out.println("Available Buses:");

        for (Bus b : buses) {
            b.displayBusInfo();
        }

        int user_opt = 1;

        while (user_opt == 1) {
            System.out.println("\nEnter 1 to book bus or 2 to exit:");
            System.out.print("Your choice: ");
            user_opt = scan.nextInt();

            if (user_opt == 1) {
                Booking booking = new Booking();

                if (booking.isAvailable(bookbus, buses)) {
                    booking.add(bookbus);
                    System.out.println("Your Booking is Confirmed!");
                } else {
                    System.out.println("Sorry, Bus is Full. Try another date or bus.");
                }
            } else {
                System.out.println(" Thank you! Visit Again.");
            }
        }

        scan.close();  
    }
}

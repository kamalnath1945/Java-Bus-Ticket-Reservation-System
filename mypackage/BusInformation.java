package mypackage;

import java.util.Scanner;
import java.util.ArrayList;

public class BusInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus(12, false, 50));
        buses.add(new Bus(14, true, 60));
        buses.add(new Bus(18, false, 80));

        // Display Bus Information
        System.out.println("Available Buses:");
        for (Bus b : buses) {
            b.BusInfo();
        }
        
        int choice = 1;
        while (choice == 1) {
            System.out.println("Enter 1 to book, 2 to exit:");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Booking process initiated...");
                    // Add booking logic here
                } else if (choice == 2) {
                    System.out.println("Exiting the booking system. Thank you!");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear invalid input
            }
        }

        sc.close();
    }
}

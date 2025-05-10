package mypackage;

import java.util.*;
import java.text.SimpleDateFormat;

public class Cancel {

    private Booking booking;
    private Destinations d;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> ct = new ArrayList<>();
    
    private int c;  

    public Cancel(Booking booking, Destinations d) {
        this.booking = booking;
        this.d = d;
    }

    public void Cancellation() {
        while (true) {
            System.out.println();
            System.out.println("If you want to cancel the ticket, press '2':");
            int can = sc.nextInt();
            sc.nextLine(); 
            if (can == 2) {
                break;
            } else {
                System.out.println("You entered the wrong input. Please try again.");
            }
        }
    }

    public void PhoneNo() {
        while (true) {
            System.out.println();
            System.out.println("Enter your Phone No for Cancellation: ");
            String ph = sc.nextLine();

            if (ph.equals(booking.p.get(0))) {
                break;
            } else {
                System.out.println("Sorry! Doesn't match your phone number.");
            }
        }
    }

    public void TicCancel() {
        while (true) {
            System.out.println();
            System.out.println("How many tickets do you want to cancel?");
            c = sc.nextInt();
            sc.nextLine(); 
            if (c > 0 && c <= booking.tic) {
                break;
            } else {
                System.out.println("You booked " + booking.tic + " tickets. You can cancel between 1 and " + booking.tic + ".");
            }
        }
    }
    String pname;
    public void getValidPassengerName(int passengerNumber) {
        String name;
        while (true) {
            System.out.println();
            System.out.println("Enter Passenger name " + passengerNumber + ": ");
            name = sc.nextLine();

            if (booking.st.contains(name)) {
                pname = name;
                break;
            } 
            else {
                System.out.println("Sorry, you entered a wrong passenger's name. Please try again.");
            }
        }
    }

    public void PassengerNameForCancellation() {
        for (int i = 1; i <= c; i++) {
            getValidPassengerName(i);           
            ct.add(pname);
        }
        for (String name : ct) {
            booking.st.remove(name);
        }
    }

    public void InvoiceDetails() {
        Invoice invoice = new Invoice(booking, d);

        PassengerNameForCancellation();

          if(booking.tic==c){
            System.out.println();
            System.out.println("==========================================");
            System.out.println("  You Successfully Cancel The All Ticket  ");
            System.out.println("==========================================");
            System.exit(0);
          }

        System.out.println();
        System.out.println("======================================");
        System.out.println("    Successfully cancelled the ticket");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Press '1' to show updated ticket:");
        int pre = sc.nextInt();
        sc.nextLine(); 

        if (pre == 1) {
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println();
            System.out.println("========================================");
            System.out.println("                TICKET                  ");
            System.out.println("========================================");
            System.out.println("Date of Journey   : " + df.format(booking.getDate()));
            System.out.println("Bus Number        : " + booking.getBusno());
            System.out.println("Source            : " + d.fname);
            System.out.println("Destination       : " + d.tname);
            System.out.println("Pickup Point      : " + d.fbp);
            System.out.println("Phone Number      : " + booking.pno);
            System.out.println();
            System.out.println("----------PASSENGER INFORMATION----------");
            for (int i = 0; i < booking.st.size(); i++) {
                int sno = i + 1;
                System.out.println("Passenger Name " + sno + " : " + booking.st.get(i));
                System.out.println("Your Seat        : " + invoice.generateRandomWord() + " SEAT NO: " + invoice.RandomNum());
                System.out.println();
            }
            System.out.println("========================================");
            System.out.println("      Thank you for your booking!");
            System.out.println("========================================");
            System.exit(0);
        }
    }

    public void MainFun() {
        Cancellation();
        PhoneNo();
        TicCancel();
        InvoiceDetails();
    }
}


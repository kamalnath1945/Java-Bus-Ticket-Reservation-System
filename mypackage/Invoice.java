package mypackage;
import java.text.SimpleDateFormat;
import java.util.*;

public class Invoice {
    private Booking booking;
    Scanner sc1;
    Destinations d;
    public Invoice(Booking booking, Destinations d) {
        this.booking = booking;
        this.d = d;
    }

    Random random = new Random();

    public int RandomNum(){
        int rand = random.nextInt(50);
        return rand;
    }

    public String generateRandomWord() {
        String[] words = {"WINDOW", "AISLE", "MIDDLE"};
        int index = random.nextInt(words.length);
        return words[index];
    }


    public void Ticket() {

        sc1= new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("PRESS '1' to SHOW YOUR TICKET");
        int choice = sc1.nextInt();
        sc1.nextLine();

        if (choice == 1) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("                TICKET                  ");
            System.out.println("========================================");
            System.out.println();
            System.out.println("Date of Jouney   : " + df.format(booking.getDate()));
            System.out.println("Bus Number       : " + booking.getBusno());
            System.out.println("Source           : "+d.fname);
            System.out.println("Destination      : "+d.tname);
            System.out.println("Pickup Point     : "+d.fbp);
            System.out.println("Phone Number     : "+booking.pno);
            System.out.println();
            System.out.println("----------PASSENGER INFORMATION----------");
            for (int i = 0; i < booking.st.size(); i++) {
                int sno = i + 1;
                System.out.println();
                System.out.println("Passenger Name "+sno+" : " + booking.st.get(i));
                System.out.println("Your Seat        : " + generateRandomWord()+" SEAT NO: "+RandomNum());
                
            }   
            System.out.println("========================================");
            System.out.println("      Thank you for your booking!"     );
            System.out.println("========================================");
            System.out.println();

                } 
        else {
            System.out.println("Invalid option. Please press '1' to show your ticket.");
        }

    }     
        
        
}    


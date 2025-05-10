package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Destinations d = new Destinations();
    Booking booking;
    int val;
    int choice;
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Bus> buses = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    public void DestInfo(){
        d.DestinationNew();
        d.BoardingPoint();
    }

    public void ShowBus(){
        System.out.println("\nPRESS '1' to SHOW AVAILABLE BUSES");
        val = sc.nextInt();
        System.out.println();
    }

    public void BusInformation(){
        
        buses.add(new Bus(12, true, 2));
        buses.add(new Bus(14, false, 3));
        buses.add(new Bus(16, true, 4));
        
       
        if (val == 1) {
            System.out.println("======================================");
            for (Bus b : buses) {
                b.BusInfo();
            }
            System.out.println();
            System.out.println("======================================");
        } 
        else {

            System.out.println("Invalid input. Exiting...");
            while(true){
                ShowBus();
                if(val==1){
                    break;
                }
            }
            
        }
    }
    public void ChoiceWrong(){
        System.out.println("\nEnter 1 to book, 2 to exit:");          
        choice = sc.nextInt();
    }

    public void BookProcess(){
       
        if (choice == 1) {
            booking = new Booking(buses);
            if(booking.isAvailable(bookings, buses)) {

                bookings.add(booking);

                System.out.println("\n===========================");
                System.out.println(" Your booking is confirmed ");
                System.out.println("===========================\n");
            }
            else{
                System.out.println("Sorry Bus is Full Try another bus or date");
            }
        }   
        else if (choice == 2) {
            System.exit(0);
        }
        else{
            System.out.println("Wrong Input is Exist");
            while(true){

                ChoiceWrong();                  
                BookProcess();
                
                if(choice==1){
                    break;
                }
            }
        }
       
    }

    public void InvoiceShow(){
        Invoice invoice = new Invoice(booking,d);
        invoice.Ticket();
    }

    public void CancelProcess(){
        Cancel cancel = new Cancel(booking,d);
        cancel.MainFun();
    }
 
    public static void main(String[] args) {

        boolean busAvailable = false;
        busAvailable = true;

        Main o = new Main();

        o.DestInfo();
        o.ShowBus();
        o.BusInformation();
        o.ChoiceWrong();
        o.BookProcess();
        o.InvoiceShow();
        o.CancelProcess();
  
        if(!busAvailable){
            System.out.println("SORRY! NO SEATS IN ALL BUSES");
            System.exit(0);
        }

       
    }
}
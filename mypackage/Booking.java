package mypackage;
import java.util.ArrayList;
import java.util.Date;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
  String passengername;
  int busno;
  Date date;
  int a;
  
  Scanner sc = new Scanner(System.in);
  ArrayList<String> st = new ArrayList<>();
  ArrayList<Integer> it = new ArrayList<>();
  ArrayList<String> itg = new ArrayList<>();
  ArrayList<String> p = new ArrayList<>();

  Booking bk;
  Bus buses;
  int i;
  int tic=0;
  String pno;
  int flag=0;
  String data;

public void DateFormat(){
  while(true){
    System.out.println("Enter booking date (dd-mm-yyyy)");
    data = sc.next();
    itg.add(data);
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    try{
      date = df.parse(data);
      break;
    }
    catch(ParseException e){
      //e.printStackTrace();
        System.out.println();
        System.out.println("Invalid input. Please enter correct format");
        System.out.println();
      
    }
  }
}


  Booking(ArrayList<Bus> buses){
    System.out.println();
    System.out.println("Enter Bus No : ");
    while (!sc.hasNextInt()) {
      System.out.println("Invalid input. Please enter a valid bus number.");
      sc.next();
    }
    this.busno=sc.nextInt();
    it.add(busno);

    System.out.println();
    DateFormat();
    System.out.println();

    System.out.println("No of Tickets : ");
    while (!sc.hasNextInt()) {
      System.out.println("Invalid input. Please enter a valid number of tickets.");
      sc.next();
    }
    this.tic = sc.nextInt();
    sc.nextLine(); // Consume leftover newline
    System.out.println();
    
    Bus selectedBus = null;
    boolean busFound = false;
    for (Bus bus : buses) {
      if (bus.getBusNumber() == busno) {
        busFound = true;
        selectedBus = bus;
        break;
      }
    }
    
    if (!busFound || selectedBus.getCapacity() < tic) {
      System.out.println("SORRY! NO SEATS IN BUS NO : "+busno);
      System.exit(0);
    }

    System.out.println("Enter Phone No :");
    this.pno=sc.nextLine();
    p.add(pno);

    for(i=1; i<=tic; i++){
      System.out.println();
      System.out.println("Enter name of passenger "+i+": ");
      this.passengername = sc.nextLine();
      st.add(passengername);
      //sc.nextLine();    
    }
        
  }
  
  public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
    int cap=0;
    for(Bus bus : buses){
      if(bus.getBusNumber()==busno){
        cap=bus.getCapacity();
      }
    }
    int booked=0;
    for(Booking bk: bookings){
      if(bk.busno==busno && bk.date.equals(date)){
          booked++;
      }
    }
    return booked<cap?true:false;
        
  }

    public int getBusno() {
      return this.busno;
    }
    public Date getDate() {
      return this.date;
    
    }   
  //sc.close();  
}

  



package mypackage;
import java.util.*;

public class Destinations {

  Scanner sc = new Scanner(System.in);

  String fname;
  String tname;
  int tic;
  int j=0;
  int price;
  int f,t;
  int ticbook;
  int src;
  int dest;
  int brd;
  String fbp;
  int bp;
  int flagvariable=0;
  int flagvariable1=0;
  int flagvariable2=0;
  int s;

  public void GetSource(){

    System.out.println();
    System.out.println("========================================");
    System.out.println("  Welcome to Bus Ticket Booking System");
    System.out.println("========================================");
    System.out.println();
    while(true){
      System.out.println("Enter press '1' To show SOURCE PlACES:");
      src=sc.nextInt();
      sc.nextLine();
      if(src==1){
        break;
      }
      else{
        System.out.println("Invalid input. Please enter 1");
        System.out.println();
      }
    }
  }


  public void GetDest(){
    while (true) {
      System.out.println("Enter press '1' To show DESTINATION PlACES:");
      dest=sc.nextInt();
      sc.nextLine();
      if(dest==1){
        break;
      } 
      else{
        System.out.println("Invalid input. Please enter 1");
        System.out.println();
      }     
    }

  }

  ArrayList<String> source = new ArrayList<>();

  ArrayList<String> trichy = new ArrayList<>();
  ArrayList<String> madurai = new ArrayList<>();
  ArrayList<String> karur = new ArrayList<>();
  ArrayList<String> dindigul = new ArrayList<>();
  

  public void DestinationNew(){

    source.add("TRICHY");
    source.add("MADURAI");
    source.add("KARUR");
    source.add("DINDIGUL");

    trichy.add("Palpannai");
    trichy.add("Chatram");
    trichy.add("Mannarpuram");

    madurai.add("Mattuthavani");
    madurai.add("Periyar bus stand");
    madurai.add("Fathima Collage");

    karur.add("Sai Baba colony");
    karur.add("Omni bus stand");
    karur.add("MKCE College");

    dindigul.add("Dindigul byepass");
    dindigul.add("Vani Villas bus stop");
    dindigul.add("Marry school");

    System.out.println();
    
    GetSource();

    while(src!=1){
      System.out.println();
      System.out.println("Invalid input. Please enter '1' to continue.");
      System.out.println();
      GetSource();
    }
    if(src==1){
      System.out.println();
      for(int i=0; i<source.size(); i++){
        int c=i+1;                
        System.out.println(c+". "+source.get(i));
      }
      
      while(true){
        System.out.println();
        System.out.println("Enter Your Source Place (Number) : ");
        s = sc.nextInt();
        sc.nextLine();

        switch (s) {
          
          case 1:
            this.fname="TRICHY";
            flagvariable=1;
            break;
          case 2:
            this.fname="MADURAI";
            flagvariable=1;
            break;
          case 3:
            this.fname="KARUR";
            flagvariable=1;
            break;
          case 4:
            this.fname="DINDIGUL";
            flagvariable=1;
            break;

          default:            
            System.out.println();
            System.out.println("Invalid input. Please enter Valid Number");
            break;
        }
        if(flagvariable==1){
          break;
        }
      }
      
    }

    System.out.println();
    GetDest();
    while(dest!=1){
      System.out.println();
      System.out.println("Invalid input. Please enter '1' to continue.");
      System.out.println();
      GetDest();
    }
    if(dest==1){
      System.out.println();
      for(int i=0; i<source.size(); i++){
        //int c1=i+1;
        if(source.get(i)!=(fname)){
          System.out.println(i+1 +". "+source.get(i));         
        }
      }

      while(true){
        System.out.println();
        System.out.println("Enter Your Destination Place (Number): ");
        int d = sc.nextInt();
        sc.nextLine();

        if(s!=d && (d>=1 && d<=4)){
          switch (d) {
           
            case 1:
              this.tname="TRICHY";
              flagvariable1=1;
              break;
            case 2:
              this.tname="MADURAI";
              flagvariable1=1;
              break;
            case 3:
              this.tname="KARUR";
              flagvariable1=1;
              break;
            case 4:
              this.tname="DINDIGUL";
              flagvariable1=1;
              break;

            default:
              break;
          }
        }
        if(flagvariable1==1){
          break;
        }
        else{
          System.out.println();
          System.out.println("Invalid input. Please enter Valid Number");
          
        }

      }
    }


  }


  public void Price(){
    System.out.println("No Of Tickets : ");
    tic = sc.nextInt();
    price = tic*100;
  }

  public void GetBrdPoint(){
    while(true){
      System.out.println("Press 1 to show Boarding Point Places. Press 2 source place is boarding point");
      brd = sc.nextInt();
      sc.nextLine();
      if(brd==1 || brd==2){
        break;
      }
      else{
        System.out.println();
        System.out.println("Invalid input. Please enter Valid Number (1 or 2)");
        System.out.println();
      }
    }
  }

  public void BoardingPoint(){

    while(brd!=1 && brd!=2){
      System.out.println();
      GetBrdPoint();
      System.out.println();
    }

    if(brd==1){
      if(fname=="TRICHY"){
        int sno = 1;
        for(String t : trichy){
          System.out.println(sno+". "+t);
          sno++;
        }

        while(true){
          System.out.println();
          System.out.println("Enter your boarding point : ");
          bp = sc.nextInt();
          sc.nextLine();

          if(bp>=1 && bp<=3){
            flagvariable2=1;            
            fbp = trichy.get(bp-1);
          }

          if(flagvariable2==1){
            break;
          }
          else{
            System.out.println();
            System.out.println("Invalid input. Please enter Valid Number");
          }
        }
      }

      else if(fname=="MADURAI"){
        int sno = 1;
        for(String t : madurai){
          System.out.println(sno+". "+t);
          sno++;
        }

        while(true){
          System.out.println();
          System.out.println("Enter your boarding point : ");
          bp = sc.nextInt();
          sc.nextLine();
          if(bp>=1&&bp<=3){
            flagvariable2=1;
            fbp = madurai.get(bp-1);
          }

          if(flagvariable2==1){
            break;
          } 
          else{
            System.out.println();
            System.out.println("Invalid input. Please enter Valid Number");
          }
          
        }
      }

      else if(fname=="KARUR"){
        int sno = 1;
        for(String t : karur){
          System.out.println(sno+". "+t);
          sno++;
        }
        while(true){
          System.out.println();
          System.out.println("Enter your boarding point : ");
          bp = sc.nextInt();
          sc.nextLine();
          if(bp>=1&&bp<=3){
            flagvariable2=1;
            fbp = karur.get(bp-1);
          }

          if(flagvariable2==1){
            break;
          }
          else{
            System.out.println();
            System.out.println("Invalid input. Please enter Valid Number");
          }
        }
      }

      else if(fname=="DINDIGUL"){
        int sno = 1;
        for(String t : dindigul){
          System.out.println(sno+". "+t);
          sno++;
        }
        while(true){
          System.out.println();
          System.out.println("Enter your boarding point : ");
          bp = sc.nextInt();
          sc.nextLine();
          if(bp>=1&&bp<=3){
            flagvariable2=1;
            fbp = dindigul.get(bp-1);
          }

          if(flagvariable2==1){
            break;
          }
          else{
            System.out.println();
            System.out.println("Invalid input. Please enter Valid Number");
          }
        }
      }
    }

    else{
      fbp=fname;
    }
    
  }



}



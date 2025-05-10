package mypackage;
import java.util.*;
public class Bus {
  int busNumber;
  boolean ac;
  int capacity;
  Scanner sc = new Scanner(System.in);
  
  public Bus(int busNumber, boolean ac, int capacity) {
    this.busNumber = busNumber;
    this.ac = ac;
    this.capacity = capacity;
  }

  public int getBusNumber() {
    return busNumber;
  }

  public void setBusNumber(int busNumber) {
    this.busNumber = busNumber;
  }

  public boolean isAc() {
    return ac;
  }

  public void setAc(boolean ac) {
    this.ac = ac;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void BusInfo() {
    System.out.println();
    System.out.println("Bus Number: " + busNumber + ", AC: " + (ac ? "Yes" : "No") + ", Capacity: " + capacity);
  }
}

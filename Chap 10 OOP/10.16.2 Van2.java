//A shuttle van picks up passengers and drives them to a destination, where they leave the van. 
// Store the names of the boarding passengers. Don't allow boarding if the van is full. Update the odometer when the van drives
import java.util.ArrayList;
 
/**
   This class models a shuttle van.
*/
public class Van
{
   // Instance variables
   /* Your code goes here */
   private ArrayList<String> passenger;
   private int count;
   private double odometer;
   private int passengerMax;
   /**
      Constructs a van with a given capacity.
      @param maxPassengers the maximum number of passengers that this
      van can hold
   */
   public Van(int maxPassengers)
   {
      /* Your code goes here */
      passengerMax = maxPassengers;
      passenger = new ArrayList<>(maxPassengers);
      odometer = 0;
      count = 0;
   }
 
   /**
      Boards a passenger up to the capacity of this van.
      @param name the name of the passenger attempting
      to board
   */
   public void board(String name)
   {
      /* Your code goes here */
    if (count < passengerMax){
        passenger.add(name);
        count++;
    }
   }
 
   /**
      Drives the van and discharges the passengers.
      @param distance the distance driven
   */
   public void drive(double distance)
   {
      /* Your code goes here */
      odometer += distance;
      passenger.clear();
      count = 0;
   }
 
   /**
      Gets the passengers in this van.
      @return a list of passengers
   */
   public ArrayList<String> getPassengers()
   {
      /* Your code goes here */
      return passenger;
   }
 
   /**
      Gets the number of miles that this van has driven.
      @return the number of miles
   */
   public double getMilesDriven()
   {
      /* Your code goes here */
      return odometer;
   }
}
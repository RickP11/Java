//A shuttle van picks up passengers and drives them to a destination, where they leave the van. 
// Keep a count of the boarding passengers, but don't allow boarding if the van is full. Update the odometer when the van drives

/**
   This class models a shuttle van.
*/
public class Van
{
   // Instance variables
   /* Your code goes here */
   private int numPassengers;
   private int maxPassengers;
   private double odometer;
 
   /**
      Constructs a van with a given capacity.
      @param maxPassengers the maximum number of passengers that this
      van can hold
   */
   public Van(int maxPassengers)
   {
      /* Your code goes here */
      this.maxPassengers = maxPassengers;
   }


   /**
      Boards passengers up to the capacity of this van.
      @param boardingPassengers the number of passengers attempting
      to board
   */
   public void board(int boardingPassengers)
   {
      /* Your code goes here */
      if(numPassengers + boardingPassengers < maxPassengers){
        numPassengers += boardingPassengers;
      }
       else {
        numPassengers = maxPassengers;
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
      numPassengers = 0;
   }
 
   /**
      Gets the number of passengers in this van.
      @return the number of passengers
   */
   public int getPassengers()
   {
      /* Your code goes here */
      return numPassengers;
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
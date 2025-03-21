//Complete the class below that uses static methods to track how many rental cars are rented and available. 
// A newly constructed rental car is available for rental.

/**
   A rental car with static methods to count rented and available cars.
*/
public class RentalCar
{
   private boolean rented;
   private static int numberOfCarRented;/* Your code goes here */;
   private static int numberOfCarAvailable;/* Your code goes here */;
  
   /**
      Constructs a rental car.
   */
   public RentalCar()
   { 
       /* Your code goes here */
       numberOfCarAvailable++;
       rented = false;
   }
 
   /**
      Get number of cars available.
      @return count of cars that are available
   */
   public static int numAvailable() 
   {
      /* Your code goes here */
      return numberOfCarAvailable;
   }
 
   /**
      Get number of cars rented.
      @return count of cars that are rented
   */
   public static int numRented() 
   {
      /* Your code goes here */
      return numberOfCarRented;
   }
 
   /**
      Try to rent this car.
      @return true if the car was successfully rented, false if it was already
      rented
   */
   public boolean rentCar() 
   {
      /* Your code goes here */
      if(this.rented){
        return false;
      }
      rented = true;
      numberOfCarAvailable--;
      numberOfCarRented++;
      return true;
   }
 
   /**
      Return rented car.
      @return true if the car was previously rented and is now returned,
      false if it was not previously rented
   */
   public boolean returnCar()
   {
      /* Your code goes here */
      if(!this.rented){
        return false;
      }
      rented = false;
      numberOfCarAvailable++;
      numberOfCarRented--;
      return true;
   }
}
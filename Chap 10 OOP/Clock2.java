//Reimplement the digital clock from the preceding exercise, 
//representing the time as the minutes from midnight. 
//This makes the pulse method very easy, but you have to work harder to recover the hours and minutes. 
//For example, 100 minutes after midnight is 1 hour and 40 minutes.

/**
   A simulated digital clock.
*/
public class Clock
{
   private int minutesFromMidnight;
 
   /**
      Advances this clock to the next minute.
   */
   public void pulse()
   {
      ++minutesFromMidnight;
   }
 
   /**
      Gets the hours of this clock.
      @return the hours (between 0 and 23)
   */
   public int getHours()
   {
      int hours = minutesFromMidnight / 60;
      if (hours / 24 != 0){
         hours = hours - (hours/ 24) * 24;  // reset if hours is more than 24
      }
      return hours;
   }
 
   /**
      Gets the minutes of this clock.
      @return the minutes (between 0 and 59)
   */
   public int getMinutes()
   {
      /* Your code goes here */
      return minutesFromMidnight % 60;
   }
}
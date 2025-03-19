//Implement a class that simulates a traffic light. 
// The next method advances the color in the usual way, from green to yellow to red, then again to green. 
// Provide two constructors, as described in the documentation of the public interface. 
// Also supply a method that yields the number of times that this traffic light has been red.

/**
   A simulated traffic light.
*/
public class TrafficLight
{
   private String color;
   private int reds;
   /**
      Constructs a green traffic light.
   */
   public TrafficLight()
   {
      /* Your code goes here */
      color = "green";
      
   }
   
   /**
      Constructs a traffic light.
      @param initialColor the initial color "green", "yellow", or "red"
   */
   public TrafficLight(String initialColor)
   {
      /* Your code goes here */
      color = initialColor;
      if(initialColor.equals("red")){
        reds = 1;
      }
   }
 
   /**
      Moves this traffic light to the next color.
   */
   public void next()
   {
      /* Your code goes here */
      if(color.equals("red")){
        color = "green";
      }
      else if (color.equals("green")){
        color = "yellow";
      }
      else if (color.equals("yellow")){
        color = "red";
        reds++
      }
   }
 
   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   public String getColor()
   {
      /* Your code goes here */
      return color;
   }
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   public int getReds()
   {
      /* Your code goes here */
      return reds;
   }
}
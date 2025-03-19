//Reimplement the TrafficLight class using a simple counter that is advanced in each call to next. 
// If the traffic light was initially green, the counter has values 0 1 2 3 4 5 6 … . 
// If the traffic light was initially red, the counter has values 2 3 4 5 6 7 8 … . Compute the current color and the number of reds, using integer division and remainder.


/**
   A simulated traffic light.
*/
public class TrafficLight
{
   private int steps;
 
   /**
      Constructs a green traffic light.
   */
   public TrafficLight()
   {
      /* Your code goes here */
      steps = 0;
   }
 
   /**
      Constructs a traffic light.
      @param initialColor the initial color "green", "yellow", or "red"
   */
   public TrafficLight(String initialColor)
   {
      /* Your code goes here */
      if(initialColor.equals("green")){
        steps = 0;
      }
      if(initialColor.equals("red")){
        steps = 2;
      }
   }
 
   /**
      Moves this traffic light to the next color.
   */
   public void next()
   {
      steps++;
   }
 
   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   public String getColor()
   {
      /* Your code goes here */
      if(steps % 3 ==0){
        return "green";
      }
      else if ((steps- 1) % 3 ==0 || (steps - 1) ==0){
        return "yellow";
      }
      else {
        return "red";
      }
   }
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   public int getReds()
   {
      /* Your code goes here */

      if(steps % 3 ==0){
        return steps / 3;
      }
      else if ((steps- 1) % 3 ==0 || (steps - 1) ==0){
        return steps / 3;
      }
      else {
        if(steps - 2 == 0){
            return 1;
        }
        else{
        return (steps % 3);
        }
      }
      
   }
}

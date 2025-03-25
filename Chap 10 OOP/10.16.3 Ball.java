//A ball bounces along the 
//x -axis between a wall at 0 and another wall at a given distance. 
//The move method advances its position by one unit. When it reaches either wall, it changes direction.


/**
   This class models a ball that bounces off walls.
*/
public class Ball
{
   // Instance variables
   /* Your code goes here */
   private int position;
   private int pointB;
   private boolean isAtA;
 
   /**
      Constructs a ball at position 0 traveling east.
      @param rightWall the position of the wall to the right
   */
   public Ball(int rightWall)
   {
      /* Your code goes here */
      pointB = rightWall;
      isAtA = true;
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      /* Your code goes here */
      if(isAtA){
         position++;
         if(position == pointB){
            isAtA = false;
         }
      }
      else{
         position--;
         if(position == 0){
            isAtA = true;
         }
      }
   }
 
   /**
      Gets the current position.
      @return the current position
   */
   public int getPosition()
   {
      /* Your code goes here */
      return position;
   }
}
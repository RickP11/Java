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
   private int direction;
 
   /**
      Constructs a ball at position 0 traveling east.
      @param rightWall the position of the wall to the right
   */
   public Ball(int rightWall)
   {
      /* Your code goes here */
      pointB = rightWall;
      direction = 1;
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      /* Your code goes here */
      position += direction;
      if((position == 0 && direction == -1) ||((position == pointB) && (direction == 1))){
        direction = -direction;
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
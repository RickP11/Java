//A ball bounces inside a given rectangle, starting at the rectangle's bottom left corner at (0, 0) and initially moving in the northeast direction. 
// When the ball bounces on a wall, it turns 90 degrees clockwise. If it bounces on a corner, its direction reverses. 
// The move method advances its position by one unit in the (x)-direction (left or right) and one unit in the (y)-direction (up or down)


/**
   This class models a ball that bounces off walls.
*/
public class Ball
{
   // Instance variables

   private int directionX;
   private int directionY;
   private int x;
   private int y;
   private int topWall;
   private int rightWall;

   /* Your code goes here */
   /**
      Constructs a ball at (0, 0) traveling northeast.
      @param rightWall the position of the wall to the right
      @param topWall the position of the wall at the top
   */
   public Ball(int rightWall, int topWall)   
   {
      /* Your code goes here */
        this.rightWall = rightWall;
        this.topWall = topWall;
        directionX = 1;
        directionY = 1;
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      /* Your code goes here */
      x += directionX;
      y += directionY;
      turn();
      
   }
 
   /**
      Turns the ball direction 90 degrees clockwise.
   */
   private void turn()
   {
      /* Your code goes here */
      if((y == topWall && directionY == 1) || (y == 0 && directionY == -1)){
        directionY = -directionY;
      }
      if((x == rightWall && directionX == 1) || (x == 0 && directionX == -1)){
        directionX = -directionX;
      }
   }
 
   /**
      Gets the current x-position.
      @return the x-position
   */
   public int getX()
   {
      /* Your code goes here */
      return x;
   }
 
   /**
      Gets the current y-position.
      @return the y-position
   */
   public int getY()
   {
      /* Your code goes here */
      return y;
   }
}
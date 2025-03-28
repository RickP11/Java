//A FastCritter moves twice as fast as a regular critter. When asked to move by n steps, it actually moves by 2 * n steps. 
// Implement a FastCritter subclass of Critter whose move method behaves as described

import java.util.ArrayList;

/**
   A simulated critter.
*/
public class Critter
{
   private int position;
   private ArrayList<String> history;

   /**
      Constructs a critter at position 0 with blank history.
   */
   public Critter()
   {
      position = 0;
      history = new ArrayList<String>();
   }

   /**
      Gets the history of this critter.
      @return the history
   */
   public ArrayList<String> getHistory()
   {
      return history;
   }

   /**
      Adds to the history of this critter.
      @param newValue the desired state
   */
   public void addHistory(String event)
   {
      history.add(event);
   }

   /**
      Gets the position of this critter.
      @return the position
   */
   public int getPosition()
   {
      return position;
   }

   /**
      Moves this critter.
      @param steps the number of steps by which to move.
   */
   public void move(int steps)
   {
      position = position + steps;
      addHistory("move to " + position);
   }

   /**
      The action of this critter in one step of the simulation.
   */
   public void act()
   {
   }
}

public class FastCritter extends Critter {

   private int fastPosition;

   @Override
   public void move(int steps){
      fastPosition += (2 * steps);
      addHistory("move to " + fastPosition);
   }
}
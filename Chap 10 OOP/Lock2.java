//10.5.2
//The Lock class of the preceding problem has a small problem. 
//It does not support combinations that start with one or more zeroes. 
//For example, a combination of 0042 can be opened by entering just 42.

//Solve this problem by choosing a different representation. 
//Instead of an integer, use a string to hold the input.
/**
   A simulated lock with digit buttons.
*/
public class Lock
{
   private String combination = "0042"; 
   private String input = "";
 
   /**
      Simulates a digit button push.
      @param button a digit 0 ... 9
   */
   public void push(int button)
   {
      input = input + Integer.toString(button);
   }
   
   /**
      Simulates a push of the open button.
      @return true if the lock opened
   */
   public boolean open()
   {

      if(input.length() <= 4 && input.equals(combination)){
         input = "";
         return true;
      }
      else{
         input ="";
         return false;
      }
   }
}
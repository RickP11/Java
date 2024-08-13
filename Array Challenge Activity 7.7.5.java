/**Write a method reverse that takes an array as an argument and reverses it.
 *  Do not create a new array. Modify the array parameter. */


public class ArrayUtils
{
   /**
    * Reverses the order of the elements in an array.
    * @param words an array of String to reverse.
    */
    
   public static void reverse(String[] words)
   {
    String temp = "";
    int count = words.length - 1;
      for (int i = 0; i < words.length; i++)
      {
        
        if (count >= 0){
        temp = words[count];
         words[i] = temp;
         count--;
        }
        
      }
   }

}
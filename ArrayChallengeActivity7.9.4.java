/**
 * Modify the algorithm in the "Common Array Algorithms" section to use an array of strings, and to find the last match. 
 * In this example, a match is a word of a specified length. 
 * For example, when asked for the last word of length 3, you should locate "was" at index 7.
 */

import java.util.Scanner;

public class FindLast {
   public static void main (String [] args) {
      String[] words = { "Mary", "had", "a", "little", "lamb",
                         "it's", "fleece", "was", "white", "as",
                         "snow" };
            
      Scanner in = new Scanner(System.in);
      System.out.print("Word length: ");
      int wordLength = in.nextInt();
      boolean found = false; /* Your code goes here */
      int pos = 0/* Your code goes here */;
      int lastIndex; 
      while (pos < words.length/* Your code goes here */)
      {
         if (words[pos].length() == wordLength/* Your code goes here */)
         {
            /* Your code goes here */
            lastIndex = pos;
            found = true;
         }
         pos++;
      }
      pos = lastIndex;

      if (found)
      {
         System.out.println("Found " + words[pos] + " at position " + pos);
      }
      else
      {
         System.out.println("No word of length " + wordLength);
      }
   }
}

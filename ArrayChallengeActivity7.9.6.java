/*For comma separators, the Arrays.toString method is the easiest solution. Consider this algorithm for collecting all matches into an an array.

int matchesSize = 0;
for (int i = 0; i < values.length; i++)
{
   if (values[i] fulfills the condition)
   {
      matches[matchesSize] = values[i]; 
      matchesSize++;
   }
}
Adapt this algorithm, along with Arrays.toString to solve the previous problem.
 */

 // Extra comment: This challenge activity should have mentioned that "write the code to give out the string of elements in values"
// that are positive

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils 
{
   public static void main (String [] args) 
   {
      Scanner in = new Scanner(System.in);
      int length = in.nextInt();
      int values[] = new int[length];
      for (int i = 0; i < values.length; i++)
      {
         values[i] = in.nextInt();
      }
      int numMatches = 0;
      int count = 0;

      /* Count the number of matches here */
      for (int i = 0; i < values.length; i++)
      {
        if (values[i] > 0)
        {
            numMatches++;
        }
      }
      
      int[] matches = new int[numMatches];
      
      /* Adapt the algorithm here */
      for (int i = 0; i < values.length; i++)
      {
        if (count <= numMatches && values[i] > 0)
        {
            matches[count] = values[i];
            count++;
        }
      }

      System.out.println(Arrays.toString(matches));
  }
}
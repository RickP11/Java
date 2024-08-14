/**Here is the algorithm for counting matches from the the "Counting Matches" subsection of the "Common Loop Algorithms" section:

int spaces = 0;
for (int i = 0; i < str.length(); i++)
{
   char ch = str.charAt(i);
   if (ch == ' ') { spaces++; }
}
Adapt this algorithm to print the number of positive and negative values in a given array. Zero is neither positive nor negative.
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int length = in.nextInt();
      int nums[] = new int[length];
      for (int i = 0; i < nums.length; i++)
      {
         nums[i] = in.nextInt();
      }
      int pos = 0;
      int neg = 0;

      /* Your code goes here */
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] < 0) {
            neg++;
        }
        else if (nums[i] > 0) {
            pos++;
        }
      }

      System.out.printf("%s has %d positive and %d negative.%n", Arrays.toString(nums), pos, neg);
   }
}
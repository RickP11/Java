/**Write an enhanced for loop that multiplies all elements in an int[] array named factors,
 accumulating the result in a variable named product. */


import java.util.Scanner;
import java.util.Arrays;

public class Numbers
{
   public static int multiply(int[] factors)
   {
      int product = 1;
      
      for (int number : factors)
      {
         product *= number;
      }
            
      return product;
   }
}
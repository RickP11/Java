//When printing separators, we skipped the separator before the initial element.
// Rewrite the loop so that the separator is printed after each element, except for the last element.


import java.util.Scanner;

public class Separators
{
   public static void printArray(int[] values)
   {
      for (int i = 0; i < values.length; i++)
      {
         System.out.print(values[i]);
         if (i != values.length - 1)
         {
            System.out.print(" | ");
         }
      }
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int length = in.nextInt();
      int [] myArray = new int [length];
      for (int i = 0; i < length; i++) 
      {
         myArray[i] = in.nextInt();
      }
      printArray(myArray);
   }
}
import java.util.Scanner;

public class FindNext
{
   /**
      Finds the next occurrence of an element in an array.
      @param values an array of values
      @param searchedValue the value to search for
      @param start the position at which to start the search
      @return the position of the first match at position >= start,
      or -1 if the element was not found
   */
   public static int findNext(int[] values, int searchedValue, int start)
   {
      /* My code starts here */
      int count = 0;
      int index = 0;
      for (int i = 0; i < values.length; i++) {
         if (values[i] == searchedValue && i >= start) {
          count++;}
         if (count == 1) {
          index = i;
          break;
         }
      }
      if (count == 0) {
         index = -1;
         }
      return index;
   }
    /* My code ends here */
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      int[] arr1 = { 3, 1, 4, 1, 5, 9, 2, 6 };
      System.out.println(findNext(arr1, in.nextInt(), in.nextInt()));
   }
}
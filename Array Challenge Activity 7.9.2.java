import java.util.Arrays;
import java.util.Scanner;

public class FindAll
{
   /**
      Finds the positions of all occurrences of an element in an array.
      @param values an array of values
      @param searchedValue the value to search for
      @param the positions of all matches
   */
   public static int[] findAll(int[] values, int searchedValue)
   {
        ///* Your code goes here */
      int[] result;
      int resultSize = 0;
      
      int pos = -1;
      for (int i = 0; i < values.length; i++)
      {
         pos = findNext(values, searchedValue, pos + 1);
         if (pos >= 0 && searchedValue == values[i]) 
         {
            /* Your code goes here */
            resultSize++;
         }
         pos++;
      }
      /* Your code goes here */
      result = new int[resultSize];
      
      int count = 0;

      for (int i = 0; i < values.length; i++ ) {
        if(searchedValue == values[i]) {
            result[count] = i;
            count++;
        }
      }
      return result;          
   }

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
      /* Your code goes here */
      int count = 0;
      int index = 0;
      for (int i = 0; i < values.length; i++){
        if (values[i] == searchedValue && i >= start)
        {
            count++;
        }
        if (count == 1) {
            index = i;
            break;
        }
        if (count == 0) {
            index = -1;
        }
      }
      return index;
   }
   
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      String arrStr = in.nextLine();
      String[] strArray = arrStr.split(" ");
      int[] intArray = new int[strArray.length];
      for (int i = 0; i < strArray.length; i++) 
      {
         intArray[i] = Integer.parseInt(strArray[i]);
      }
      int searchedValue = in.nextInt();
      System.out.println(Arrays.toString(findAll(intArray, searchedValue)));
   }
}
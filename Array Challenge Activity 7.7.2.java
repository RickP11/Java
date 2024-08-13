/**Write a method named fill that fills all elements of an array of integers with a given value.
 *  For example, the call fill(scores, 10) should fill all elements of the array scores with the value 10 */

public class ArrayUtils
{
   /**
    * Fills an array with a particular value.
    * @param numbers the array of int
    * @param value the value to store in each element.
    */
       
   public static void fill(int[] numbers, int value)
   {
      for (int i = 0; i < numbers.length; i++)
      {
         numbers[i] = value;
      }
   }
          
}
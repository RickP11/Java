/**Write a method named randomInts which returns an array whose length is given in the first argument. 
 * The array is filled with random integers between 0 and n - 1.

Hint: use (int)(Math.random() * n) to generate each random number. */

public class ArrayUtils
{
   /**
    * Returns an int array of length len, with 0 >= values < n.
    * @param len the size of the returned array.
    * @param n the upper (excluded) bounds of the random numbers.
    * @return the array as described here.
    */

   public static int[] randomInts(int len, int n)
   {
      int[] result = new int[len];
      for (int i = 0; i < len; i++){
        result[i] = (int)(Math.random() * n);
      }
      return result;
   }   
}
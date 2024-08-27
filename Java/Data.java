//Write a method that returns the sum of a given row in a two-dimensional array. Complete this code:

public class Data
{
   private int[][] values;

   /**
      Computes the sum of a given row in a two-dimensional array.
      @param the row whose sum to compute
      @return the sum of the given row
   */
   public int rowSum(int row)
   {
      int sum = 0;
      /* Your code goes here */
      for (int i = 0; i < values[0].length; i++)
      {
         sum += values[1][i];
      }
      return sum;
   }

   public Data(int[][] data) { values = data; }
}
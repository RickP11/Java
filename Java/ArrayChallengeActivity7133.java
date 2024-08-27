//Write a method that returns the sum of a given row in a two-dimensional array. Complete this code:
public class ArrayChallengeActivity7133
{
   /**
      Computes the sum of a given row in a two-dimensional array. 
      @param values the array
      @param the row whose sum to compute
      @return the sum of the given row
   */
      
   public static int rowSum(int[][] values, int row) 
   {
      /* Your code goes here */
      int sum = 0;
      for(int i = 0; i < values[0].length; i++)
      {
         sum += values[row][i];
      }
      return sum;
   }
   
}
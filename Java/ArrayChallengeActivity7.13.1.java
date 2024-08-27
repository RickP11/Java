//Complete this code to compute the average of the four corner elements of the given two-dimensional array.


public class Tables
{
   public static double cornerAverage(double[][] values)
   {
      int rows = values.length;
      int columns = values[0].length;
      double sum = 0;
      /* Your code goes here */
      sum = values[0][0] + values[0][columns-1]+values[rows-1][0]+values[rows-1][columns-1];
      return sum / 4;
   }
}
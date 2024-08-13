/**Compute the distance between the positions of the first and last zero element in the given array. For example, if the array is

3 0 1 0 4 9 5 0 6 your algorithm should yield 7 - 1 = 6.

If the array contains a single zero, return 0. If it doesn't contain any zeroes, return a negative value.

*/

public class Numbers
{
   public static int zeroesDistance(double[] values)
   {
      int firstPos = 0;
      int lastPos = values.length - 1;
      boolean found = false;

      while (firstPos < values.length && !found){
        if(values[firstPos] == 0){
          found = true;
        }
        else {
            firstPos++;
        }
      }
        if(found == false){
            return -1;
        }
        
        while (lastPos > 0 && found) {
            if(values[lastPos] == 0) {
                lastPos = lastPos;
                break;
            }
            else {
                lastPos--;
            }
        }
      /* Your code goes here */
      return lastPos - firstPos;
   }
}
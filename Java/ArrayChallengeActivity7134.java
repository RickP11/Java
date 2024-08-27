//Write a method that checks whether all elements in the indicated column are the same.
public class ArrayChallengeActivity7134
{
   /**
    * Return true if all elements in col are the same.
    * @param board a 3 x 3 array of String
    * @param col the column to check
    * @return true if all elements are the same.
    */
    public static boolean checkCol(String[][] board, int col)
    {
       boolean isSame = false;
         if(board[0][col].compareTo(board[1][col]) == 0 &&
         board[1][col].compareTo(board[2][col]) == 0)
         {
            isSame = true;

         }
      return isSame;
    }
}
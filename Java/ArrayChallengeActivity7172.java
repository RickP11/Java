/**Consider an 8 × 8 array for a board game:

int[][] board = new int[8][8];

Using two nested loops, initialize the board so that zeroes and ones alternate, as on a checkerboard:

0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1
. . .
1 0 1 0 1 0 1 0
Hint: Check whether i + j is even.
*/
public class ArrayChallengeActivity7172
{
   public static void main(String[] args)
   {
      int[][] board = new int[8][8];

      for (int i = 0; i < 8; i++)
      {
         for (int j = 0; j < 8; j++)
         {
            if(i % 2 == 0 && j % 2 != 0)
            {
               board[i][j] = 1;
            }
            else if (i % 2 != 0 && j % 2 == 0)
            {
               board[i][j] = 1;
            }
         }
      }
      
      Util2D.print(board);
   }
}
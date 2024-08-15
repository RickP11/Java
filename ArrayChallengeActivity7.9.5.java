/**
 The program below uses the element separators algorithm in the "Common Array Algorithms" section to print all elements of an array, 
 separated by vertical bars. Adapt this algorithm to print all positive values, separated by commas.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils 
{
   public static void main (String [] args) 
   {
    Scanner input = new Scanner(System.in);
    int valuesLength = input.nextInt();
    int[] values = new int[valuesLength];

    for(int i = 0; i < valuesLength; i++)
    {
        values[i] = next.Int();
    }

    // Iniatiate the @variable lastPositive 
    // to store the last index of values's element that is positive
    int lastPositive = -1;

    for(int i = 0; i < valuesLength; i++)
    {
        if(values[i] > 0)
        {
            lastPositive = i;
        }
    }
    // If values at index i is positive and not the last positive then print the value + ","
    // Else if values at index i is positive and is the last positive then print only the value.
    // This is to prevent the display to have "," after the last positive element. 
    for(int i = 0; i < valuesLength; i++)
    {
        if(values[i] > 0 && i != lastPositive)
        {
            System.out.print(values[i]);
            System.out.print(", ");
        }
        else if (values[i] > 0 && i == lastPositive)
        {
            System.out.print(values[i]);
        }
    }
}
}
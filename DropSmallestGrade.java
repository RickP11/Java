import java.util.Arrays;
import java.util.Scanner;

/**
   This program computes a final score for a series of quiz scores: the sum  
   after dropping the lowest score. The program uses arrays.
*/

// This is the example from section 7.10. I have read through the code provided by Zybooks
// and rewrite the code to practice and get better understanding
public class Scores
{
   public static void main(String[] args)
   {
      // initiate the array using input from users
      double[] array = readInputs();
      // give condition what a valid array is
      if(array.length == 0)
      {
        System.out.println("At least one score is entered");
      }
      else
      {
        double total = calculateSum(array) - smallest(array);
        System.out.println("The total after drop the smallest grade is: " + total);
      }
      // calculation of sum without the lowest value of 1 array element
   }

   /**
      Reads a sequence of floating-point numbers.
      @return an array containing the numbers
   */
    public static double[] readInputs()
    {
        // initiate an array
        int arraySize = 10;
        double[] inputs = new double[arraySize];
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number or Enter \"Q\" to quit: ");

        int actualSize = 0;
        double userInput;
        while(scnr.hasNext())
        {
            if(scnr.hasNextDouble())
            {
                if(actualSize >= inputs.length)
                {
                    inputs = Arrays.copyOf(inputs, 2 * inputs.length);
                }
                inputs[actualSize] = scnr.nextDouble();
                actualSize++;
            }
            else
            {
                String input = scnr.next();
                if((input.toUpperCase()).equals("Q"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please enter a number or click Q to start calculation");
                }
            }
        }
        return Arrays.copyOf(inputs, actualSize);
    }
  
   
   /**
      Computes the sum of the values in an array.
      @param values an array
      @return the sum of the values in values
   */
   public static double calculateSum(double[] values)
   {
    double sum = 0.0;
    for( int i = 0; i < values.length; i++)
    {
        sum += values[i];
    }
    return sum;
   }
      
   /**
      Gets the minimum value from an array.
      @param values an array of size >= 1
      @return the smallest element of values
   */
   public static double smallest(double[] values)
   {
    double smallest = values[0];
    for(int i = 0; i < values.length; i++)
    {
        if(values[i] <= smallest )
        {
            smallest = values[i];
        }
    }
    return smallest;
   }
}


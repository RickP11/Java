//Write a program that prompts the user for an input file name, reads all words from the input file, 
//and writes the words to the output file named sentences.txt. 
//Start a new line whenever a word ends in a period, question mark, or exclamation mark.

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class InputOutputChallenge811 {
    public static void main(String[] args) throws FileNotFoundException
    {
        // Prompt the user for input file name
        Scanner console = new Scanner(System.in);
        System.out.print("Input File: ");
        String inputFileName = console.nextLine();
        try
        {
            //Read the file from user's input
            File inputFile = new File(inputFileName);
            Scanner in = new Scanner(inputFile);

            //Write to an output file
            PrintStream out = new PrintStream("sentences.txt");

            //reads all words from the input file
            while(in.hasNext())
            {
                String word = in.next();
                if(word.endsWith("?") || word.endsWith("!") || word.endsWith("."))
                {
                    out.printf(word + "\n");
                }

                else
                {
                    out.printf(word + " ");
                }
            }
            in.close();
            out.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + inputFileName);
        }
    }
}
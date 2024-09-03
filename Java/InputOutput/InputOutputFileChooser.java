import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;

public class InputOutputFileChooser{
    public static void main(String[] args)
    {
        // Create file chooser object
        JFileChooser chooser = new JFileChooser();
        // Open dialog and capture user's input, null for the center of the dialog
        int result = chooser.showOpenDialog(null);
        // if user open a file
        if (result == JFileChooser.APPROVE_OPTION)
        {
            // create file object, use getSelectedFile() method from javax.swing.JFileChooser
            File selectedFile = chooser.getSelectedFile();

            try{
                Scanner scnr = new Scanner(selectedFile);
                while(scnr.hasNextLine())
                {
                    String line = scnr.nextLine();
                    System.out.println(line);
                }
                scnr.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File Not Found: " + selectedFile);
            }
        }
        else{
            System.out.println("User has cancelled choosing file");
        }
    }
}
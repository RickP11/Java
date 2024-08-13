import java.util.Arrays;

public class CopyHalf
{
   /**
      Copies the first half of an array. If the length is odd, 
      don't copy the middle value.
      @param values an array
      @return a copy of the first half of values
   */
   public static String[] copyHalf(String[] values)
   {
      String[] newValues;
      int newSize;
      if (values.length % 2 == 0) {
         newSize = values.length /2;
         newValues = Arrays.copyOf(values,newSize);
      }
      else {
         newSize = (values.length - 1) /2;
         newValues = Arrays.copyOf(values,newSize);
      }
      return newValues;
   }
   
   public static void main(String[] args)
   {
      String[] arr1 = { "Mary", "had", "a", "little", "lamb" };
      System.out.println("Full Array 1: " + Arrays.toString(arr1));
      System.out.println("Half Array 1: " + Arrays.toString(copyHalf(arr1)));
      
      System.out.println();
      
      String[] arr2 = { "its", "fleece", "was", "white", "as", "snow" };
      System.out.println("Full Array 2: " + Arrays.toString(arr2));
      System.out.println("Half Array 2: " + Arrays.toString(copyHalf(arr2)));
   }
}
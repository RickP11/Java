/**Write a method reverse that takes an array as an argument and returns a new array with the elements in reversed order. 
Do not modify the array. */
{
    /**
     * Returns an array with the elements in reversed order.
     * @param words an array of String.
     * @return a new array as described here.
     */
 
    public static String[] reverse(String[] words)
    {
        int count = words.length-1;
       String[] result = new String[words.length];
       for (int i = 0; i < words.length; i++)
       {
          result[i] = words[count];
          if (count > 0){
            count--;
          }       
       }
       return result;
    }
    
 }
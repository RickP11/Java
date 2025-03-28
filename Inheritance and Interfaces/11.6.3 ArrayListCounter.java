//Implement a class CountingArrayList that extends ArrayList<String> and that counts the number of calls to get and set.

import java.util.ArrayList;
import java.util.Collections;

public class CountingArrayListTester
{
   public static String smallest(ArrayList<String> values)
   {
      String smallestSoFar = values.get(0);
      for (int i = 1; i < values.size(); i++)
      {
         String value = values.get(i);
         if (value.compareTo(smallestSoFar) < 0)
         {
            smallestSoFar = value;
         }
      }
      return smallestSoFar;
   }   

   public static void main(String[] args)
   {
      CountingArrayList words = new CountingArrayList();
      words.add("Mary");
      words.add("had");
      words.add("a");
      words.add("little");
      words.add("lamb");
      words.add("its");
      words.add("fleece");
      words.add("was");
      words.add("white");
      words.add("as");
      words.add("snow");

      String smallest = smallest(words);
      System.out.println(words.count("get"));
      System.out.println("Expected: 11");
      System.out.println(words.count("set"));
      System.out.println("Expected: 0\n");
      
      CountingArrayListTester2 tester2 = new CountingArrayListTester2();
      tester2.main(null);
   }
}

import java.util.ArrayList;

public class CountingArrayList extends ArrayList<String>
{
  /* Your code goes here */
  private int getCounter;
  private int setCounter;
   
   /**
      Gets the counter of get or set operations.
      @param what "get" or "set"
      @return the number of get or set operations invoked on this array list.
   */
   public int count(String what) 
   { 
      /* Your code goes here */
      int finalCount = 0;
      if(what.equals("set")){
        finalCount = setCounter;
      }
      else if (what.equals("get")){
        finalCount = getCounter;
      }
      return finalCount;
   }
   @Override
   public String get(int index){
    getCounter++;
    return super.get(index);
   }

   @Override
   public String set(int index, String value){
    setCounter++;
    return super.set(index, value);
   }
}
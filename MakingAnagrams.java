//https://www.hackerrank.com/challenges/ctci-making-anagrams
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MakingAnagrams
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));

	}
	
	public static int numberNeeded(String first, String second) 
	{
	      HashMap<Character, Integer> hmFirst = new HashMap<Character, Integer>();
	      HashMap<Character, Integer> hmSecond = new HashMap<Character, Integer>();
	      StringBuilder sbFirst = new StringBuilder(first);
	      StringBuilder sbSecond = new StringBuilder(second);
	      
	      for(int i=0; i< first.length(); i++)  
	      {
	    	  if(hmFirst.containsKey(sbFirst.charAt(i)))
	    	  {
	    		  hmFirst.put(sbFirst.charAt(i), hmFirst.get(sbFirst.charAt(i))+1);
	    	  }
	    	  else
	    	  {
	    		  hmFirst.put(sbFirst.charAt(i), 1);
	    	  }
	      }
	      
	      for(int i=0; i< second.length(); i++)  
	      {
	    	  if(hmSecond.containsKey(sbSecond.charAt(i)))
	    	  {
	    		  hmSecond.put(sbSecond.charAt(i), hmSecond.get(sbSecond.charAt(i))+1);
	    	  }
	    	  else
	    	  {
	    		  hmSecond.put(sbSecond.charAt(i), 1);
	    	  }
	      }
	      
	      int difference = 0;
	      for(Character key : hmFirst.keySet())
	      {
	    	  if(hmSecond.containsKey(key))
	    	  {
	    		  if(hmSecond.get(key) != hmFirst.get(key))
	    		  {
	    			  difference = difference + Math.abs(hmSecond.get(key)-hmFirst.get(key));
	    		  }
	    	  }
	    	  else
	    	  {
	    		  difference = difference + hmFirst.get(key);
	    	  }
	      }
	      
	      for(Character key : hmSecond.keySet())
	      {
	    	  if(!hmFirst.containsKey(key))
	    	  {
	    		  difference = difference + hmSecond.get(key);
	    	  }
	      }
	      
	      return difference;
    }

}

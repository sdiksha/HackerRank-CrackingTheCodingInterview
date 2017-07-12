//https://www.hackerrank.com/challenges/ctci-ransom-note
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class RansomNote
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        Hashtable<String, Integer> hmMag = new Hashtable<String, Integer>();
        Hashtable<String, Integer> hmNote = new Hashtable<String, Integer>();
        for(int magazine_i=0; magazine_i < m; magazine_i++)
        {
        	String mag = in.next();
            if(hmMag.containsKey(mag))
            {
            	hmMag.put(mag, hmMag.get(mag)+1);
            }
            else
            {
            	hmMag.put(mag, 1);
            }
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++)
        {
        	String note = in.next();
            if(hmNote.containsKey(note))
            {
            	hmNote.put(note, hmNote.get(note)+1);
            }
            else
            {
            	hmNote.put(note, 1);
            }
        }

        boolean bPossible = true;
        for(String key: hmNote.keySet())
        {
        	if(!hmMag.containsKey(key) || (hmMag.get(key) < hmNote.get(key)))
        	{
        		System.out.println("No");
        		bPossible = false;
        		break;
        	}
        	
        }
        
        if(bPossible == true)
        {
        	System.out.println("Yes");
        }
        
	}

}

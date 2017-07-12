//https://www.hackerrank.com/challenges/ctci-balanced-brackets
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BalancedBrackets
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) 
        {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
	}
	
	public static boolean isBalanced(String expression) 
	{
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i< expression.length(); i++)
        {
        	if(expression.charAt(i) == '{' || expression.charAt(i) == '(' || expression.charAt(i) == '[')
        	{
        		st.push(expression.charAt(i));
        	}
        	else if(expression.charAt(i) == '}')
        	{
        		if(!st.isEmpty())
        		{
        			char s = st.pop();
            		if(s != '{')
            		{
            			return false;
            		}
        		}
        		else
        		{
        			return false;
        		}
        		
        	}
        	else if(expression.charAt(i) == ')')
        	{
        		if(!st.isEmpty())
        		{
        			char s = st.pop();
            		if(s != '(')
            		{
            			return false;
            		}
        		}
        		else
        		{
        			return false;
        		}
        	}
        	else if(expression.charAt(i) == ']')
        	{
        		if(!st.isEmpty())
        		{
        			char s = st.pop();
            		if(s != '[')
            		{
            			return false;
            		}
        		}
        		else
        		{
        			return false;
        		}
        	}
        }
        if(st.isEmpty())
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }

}

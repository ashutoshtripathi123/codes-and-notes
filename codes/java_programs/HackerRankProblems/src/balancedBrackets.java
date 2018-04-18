/*A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {)
 occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. 
 There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. 
For example, {[(])} is not balanced because the contents in between { and } are not balanced. 
The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses
 encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is considered to be balanced if the following
 conditions are met:

    It contains no unmatched brackets.
    The subset of brackets enclosed within the confines of a matched pair of brackets is also
     a matched pair of brackets.

Given strings of brackets, determine whether each sequence of brackets is balanced. 
If a string is balanced, print YES on a new line; otherwise, print NO on a new line.

Input Format

The first line contains a single integer, , denoting the number of strings.
Each line of the subsequent lines consists of a single string, , denoting a sequence of brackets.

Constraints

    , where is the length of the sequence.
    Each character in the sequence will be a bracket (i.e., {, }, (, ), [, and ]).

Output Format

For each string, print whether or not the string of brackets is balanced on a new line. 
If the brackets are balanced, print YES; otherwise, print NO.

Sample Input

3
{[()]}
{[(])}
{{[[(())]]}}

Sample Output

YES
NO
YES
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class balancedBrackets {
    
	public static class Node
	{
		char expression;
		Node next;
	}
	
	static Node head = null;
	
	/* The push pop logic should be implemented inside this,
	 * when u receive the String, parse each character, and insert it into the stack
	 * if they are the opening ones, and adjust the head. If they are the closing one's
	 * then check before popping. If mismatch, return false immediately, no need to check others
	 * If however it goes upto the end of the String length, then check if the head has become 
	 * Null or not again */
    public static  boolean isBalanced(String expression) {
        char single;
        int strLength=expression.length();
        for(int i=0;i<strLength;i++)
        {
        	single=expression.charAt(i);
        	if(single=='(' || single == '[' || single == '{')
        	{
        		//push it into the stack
        		Node temp = new Node();
        		temp.expression = single;
        		temp.next = head;
        		head = temp;
        	}
        	else //if(single==')' || single == ']' || single == '}')
        	{
                if(head==null)
                    return false;
        		//pop from the stack, however check if it matches with the head
        		if(single == ')')
        		{
        			if(head.expression == '(')
        			{
        				head = head.next;
        			}
        			else
        			{
        				//Mismatched Pop, no need to check ahead, return false from here itself
        				return false;
        			}
        		}
        		else  if(single == '}')
        		{
        			if(head.expression == '{')
        			{
        				head = head.next;
        			}
        			else
        			{
        				//Mismatched Pop, no need to check ahead, return false from here itself
        				return false;
        			}
        		}
        		else  if(single == ']')
        		{
        			if(head.expression == '[')
        			{
        				head = head.next;
        			}
        			else
        			{
        				//Mismatched Pop, no need to check ahead, return false from here itself
        				return false;
        			}
        		}        		
        	}
        }
        
        if(head == null)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String []arr = new String[t];
        for (int a0 = 0; a0 < t; a0++) {
            arr[a0] = in.next();
        }
        
        for(int a0=0;a0<t;a0++)
        {
        	head=null;//this is necessary, as say suppose last String was unsuccessful,
        	          // then in that case, the head would still be pointing to some leftover data
        	System.out.println( (isBalanced(arr[a0])) ? "YES" : "NO" );
        }
        
        in.close();
    }
}
